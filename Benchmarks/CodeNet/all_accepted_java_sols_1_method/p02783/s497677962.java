import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int []arr=new int[2];
		int c=0;
		for(int i=0;i<2;i++) {
			arr[i]=sc.nextInt();
		}
		while (arr[0]>0) {
			arr[0]=arr[0]-arr[1];
			c++;
		}
		System.out.println(c);
	}
	
}