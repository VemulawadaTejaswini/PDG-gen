#include<iostream>
#include<map>
#include<string>
#include<cstdio>
typedef unsigned long long ull;
const long long inf = 1e18; 
using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(0);
	int n;
	ull ans=1,temp,t;
	int flag=0;
	cin>>n;
	for(int i=0;i<n;i++)
	{
		cin>>temp;
		t=ans*temp;
		if(t<ans||t>inf)
			flag=1;
		else
			ans=t;
	}
	if(flag||ans>inf)
		cout<<-1<<endl;
	else
		cout<<ans<<endl;
	return 0;
}