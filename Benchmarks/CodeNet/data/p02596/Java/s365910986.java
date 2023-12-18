import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=0;
		int a=-1;
		for(int i=0;i<=1000001;i++) {
			n=n*10+7;
			if(n%k==0) {
				System.out.println(i);
			}
			else {
			System.out.println(a);
		}}
		
	}
}