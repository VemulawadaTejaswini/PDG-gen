import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a;
		int max=sc.nextInt();
		int min=max;
		long g=max;
		
		for (int i=1;i<n;i++){
			a=sc.nextInt();
			g=g+a;
			if(max<a) max=a;
			if(min>a) min=a;
		}
		System.out.println(min+" "+max+" "+g);
	}

}