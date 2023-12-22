import java.util.*;

public class Main { //クラス名はMain
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      	long n=sc.nextLong();
      	long o=0;
      	long x[]=new long[61];
      	for(int i=0;i<n;i++){
          	long a=sc.nextLong();
          	String bin = Long.toBinaryString(a);
          	int l=bin.length();
          	for(int j=0;j<l;j++){
              	if(bin.charAt(l-1-j)=='1')x[j]++;
            }            	
        }
      	long twoPow=1;
      	for(int i=0;i<=60;i++){
        	long p=(x[i]*(n-x[i]))%1000000007;	//xorの合計
          	o+=p*twoPow;
          	o=o%1000000007;
          	twoPow*=2;
          	twoPow=twoPow%1000000007;
        }
     	 System.out.println(o);
    }
}