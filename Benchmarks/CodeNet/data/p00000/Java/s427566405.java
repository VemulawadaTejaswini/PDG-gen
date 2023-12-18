package pkj0329;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Dice {

	public static void main(String[] args) throws Exception
	{
			int nT = 1;

				int nN = 5;
		int nW = 4,nB = 6,nE = 3;
				int nS = 2;

		int nSumDice = nN + nS + nE + nW + nB;

		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );

		while( (str = br.readLine() ) != null)
		{
			if(str.equalsIgnoreCase("E") )
			{
				nW = nB;
				nB = nE;
				nE = 21 - nSumDice;
			}
			else if(str.equalsIgnoreCase("W") )
			{
				nE = nB;
				nB = nW;
				nW = 21 - nSumDice;
			}
			else if(str.equalsIgnoreCase("S") )
			{
				nN = nB;
				nB = nS;
				nS = 21 - nSumDice;
			}
			else if(str.equalsIgnoreCase("N") )
			{
				nS = nB;
				nB = nN;
				nN = 21 - nSumDice;
			}
			else break;

			nSumDice = nN + nS + nE + nW + nB;

			nT = 21 - nSumDice;

			System.out.printf("%3d\n",nN);
			System.out.printf("%d %d %d\n",nW,nB,nE);
			System.out.printf("%3d\n",nS);
		}

	}
}