import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k=sc.nextLong();
		long d=sc.nextLong();
		x=Math.abs(x);
		long p=x%d;
		long q=x/d;
		if(q>k){System.out.println(x-(d*k)+"");}
		else{
			k=k-q;
			if(k%2==0){System.out.println(p+"");}
			else{System.out.println(""+Math.abs(p-d));}
		}
	}
}