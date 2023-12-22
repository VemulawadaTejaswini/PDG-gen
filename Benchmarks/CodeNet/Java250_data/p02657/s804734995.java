import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int a[]=new int[2];
		
		for(int i=0;i<2;i++)
			a[i]=input.nextInt();
		
		System.out.println(a[1]*a[0]);
	}

}
