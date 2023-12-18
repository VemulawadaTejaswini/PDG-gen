import java.util.*;
import java.math.*;

class Main{
	static int field[][];
	static BigInteger val[][];
	static int a,b;
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);

		while(true){
			b=s.nextInt();
			a=s.nextInt();
			if(a==0)System.exit(0);
			
			field=new int[a][b];
			val=new BigInteger[a][b];
			for(int i=0;i<a;i++){
				String line=s.next();
				for(int j=0;j<b;j++){
					if(line.charAt(j)>='A')field[i][j]=-1;
					else field[i][j]=(int)line.charAt(j)-'0';
					val[i][j]=new BigInteger("-1");
				}
			}
		
			BigInteger ans=new BigInteger("0");
			for(int i=0;i<a;i++)
				for(int j=0;j<b;j++){
					ans=ans.max(solve(i,j));
				}
			
			System.out.println(ans.toString());
		}
	}
	
	static BigInteger solve(int m,int n){
		BigInteger shita=new BigInteger("0");
		BigInteger migi=new BigInteger("0");
		
		if(!val[m][n].equals(new BigInteger("-1")))return val[m][n];
		if(field[m][n]==-1)return new BigInteger("-1");
		if(m>0&&field[m-1][n]!=-1)migi=solve(m-1,n);
		if(n>0&&field[m][n-1]!=-1)shita=solve(m,n-1);
		BigInteger ret=shita.max(migi).multiply(BigInteger.TEN).add(new BigInteger(String.valueOf(field[m][n])));
		if(ret.equals(BigInteger.ZERO))ret=new BigInteger(String.valueOf(field[m][n]));
		val[m][n]=ret;
		//System.out.println(ret.toString());
		return ret;
	}
}