#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

#define NA 1000000000

typedef struct tFare
{
	int borderDistance[50];
	int faresPerUnitDistance[50];
} TFare;

int n, m, c, s, g;
int intervalNum[20];
TFare fareData[20];

int distances[20][100][100];
int fares[20][100][100];
int faresConsideredAllCompany[100][100];

void init()
{
	int i, j, k;
	for (i = 0; i < 20; ++i)
	{
		for (j = 0; j < 100; ++j)
		{
			for (k = 0; k < 100; ++k)
			{
				distances[i][j][k] = faresConsideredAllCompany[j][k] = (j == k ? 0 : NA);
			}
		}
	}
}

int getCost(int company, int distance)
{
	if (distance == NA) { return NA; }
	if (distance == 0) { return 0; }

	int result = 0;
	int i;
	for (i = 0;; ++i)
	{
		if (distance <= fareData[company].borderDistance[i + 1])
		{
			return result +
			       (distance - fareData[company].borderDistance[i]) * fareData[company].faresPerUnitDistance[i];
		}

		result += (fareData[company].borderDistance[i + 1] - fareData[company].borderDistance[i]) *
		          fareData[company].faresPerUnitDistance[i];
	}
}


void getMinimumDistances()
{
	int i, j, k, company;

	for (company = 0; company < c; ++company)
	{
		for (i = 0; i < n; ++i)
		{
			for (j = 0; j < n; ++j)
			{
				for (k = 0; k < n; ++k)
				{
					if (distances[company][i][j] > distances[company][i][k] + distances[company][k][j])
					{
						distances[company][i][j] = distances[company][i][k] + distances[company][k][j];
					}
				}
			}
		}
	}
}

void getMinimumFare()
{
	int i, j, company;
	for (company = 0; company < c; ++company)
	{
		for (i = 0; i < n; ++i)
		{
			for (j = 0; j < n; ++j)
			{
				fares[company][i][j] = getCost(company, distances[company][i][j]);
				if (fares[company][i][j] < faresConsideredAllCompany[i][j])
				{
					faresConsideredAllCompany[i][j] = fares[company][i][j];
				}
			}
		}
	}
}

int solve()
{
	getMinimumDistances();
	getMinimumFare();

	int i, j, k;
	for (i = 0; i < n; ++i)
	{
		for (j = 0; j < n; ++j)
		{
			for (k = 0; k < n; ++k)
			{
				if (faresConsideredAllCompany[i][j] > faresConsideredAllCompany[i][k] + faresConsideredAllCompany[k][j])
				{
					faresConsideredAllCompany[i][j] = faresConsideredAllCompany[i][k] + faresConsideredAllCompany[k][j];
				}
			}
		}
	}

	return (faresConsideredAllCompany[s - 1][g - 1] == NA ? -1 : faresConsideredAllCompany[s - 1][g - 1]);
}

int main()
{
	int i, j;
	while (true)
	{
		scanf("%d %d %d %d %d", &n, &m, &c, &s, &g);
		if (n == 0) { break; }

		init();

		for (i = 0; i < m; ++i)
		{
			int x, y, d, company;
			scanf("%d %d %d %d", &x, &y, &d, &company);
			if (distances[company - 1][x - 1][y - 1] > d)
			{
				distances[company - 1][x - 1][y - 1] = distances[company - 1][y - 1][x - 1] = d;
			}
		}

		for (i = 0; i < c; ++i) { scanf("%d", &intervalNum[i]); }
		for (i = 0; i < c; ++i)
		{
			for (j = 1; j < intervalNum[i]; ++j) { scanf("%d", &fareData[i].borderDistance[j]); }
			fareData[i].borderDistance[0] = 0;
			fareData[i].borderDistance[intervalNum[i]] = NA;
			for (j = 0; j < intervalNum[i]; ++j) { scanf("%d", &fareData[i].faresPerUnitDistance[j]); }
		}

		printf("%d\n", solve());
	}

	return 0;
}
