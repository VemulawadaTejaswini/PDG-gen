import java.util.Scanner;

public class Main{
static int LONGEST=2000000000;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//System.out.print("Input -> ");
		while(sc.hasNext()){
			long a =sc.nextLong();
			long b =sc.nextInt();
			
			//System.out.println("input="+a+" "+b);
			//System.out.println("LCM="+LCM(a,b)+" "+"GCD="+GCD(a,b));
			System.out.println(GCD(a,b)+" "+LCM(a,b));
			//System.out.print("Next Input -> ");
		}
	}
	
	public static long LCM(long a,long b){
		long max=Math.max(a, b),ans=0;
		long min;
		
		if(max==a){
			min=b;
		}else{
			min=a;
		}
		for(long i=1;i<=LONGEST;i++){
			if((max*i)%min==0){
				ans=max*i;
				 break;
			}
		}
		return ans;
	}
	
	public static long GCD(long a,long b){
		long gcd;
		if(b==0){
			gcd=a;
		}else{
			gcd=GCD(b,a%b);
		}
		return gcd;
	}

}