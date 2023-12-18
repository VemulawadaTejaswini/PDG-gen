import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int sum=0;
		for(int i=0;i<n;i++) {
			if(s.substring(i,i+1).equals("R"))sum++;
		}
		System.out.println(sum>n/2?"Yes":"No");
	}
}