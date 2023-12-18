import java.util.*;
class Main{
	static long calc(long a){
		long ret=a/3*4+a/5*4;
		int l=0;
		for(long p=1;a>=p;p*=10){
			l++;
			long R=Math.min(a,p*10);
			long L=p-1;
			ret+=((R-R/3-R/5+R/15)-(L-L/3-L/5+L/15))*l;
		}
		return ret;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		long a=s.nextLong();
		long left=0L;
		long right=200000000000000000L;
		while(left+1<right){
			long M=(left+right)/2;
			if(calc(M)>=a)right=M;
			else left=M;
		}
		String str="";
		long M=left;
		for(int i=1;i<20;i++){
			if((M+i)%15==0)str+="FizzBuzz";
			else if((M+i)%3==0)str+="Fizz";
			else if((M+i)%5==0)str+="Buzz";
			else str+=""+(M+i);
		}
		int ss=(int)(a-calc(M)-1);
		String ret="";
		for(int i=0;i<20;i++)ret+=str.charAt(i+ss);
		System.out.println(ret);
	}
}