
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		int[] p=new int[N];
		int[] copy=new int[N];
		
		for(int i=0;i<N;i++) {
			p[i]=sc.nextInt();
			copy[i]=p[i];
		}
		
		Arrays.sort(copy);
		
		int count=0;
		
		for(int i=0;i<N;i++) {
			if(p[i]==copy[i]) {
				
			}else {
				count++;
			}
		}
		
		if(count==0||count==2) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		
		sc.close();
	}
}