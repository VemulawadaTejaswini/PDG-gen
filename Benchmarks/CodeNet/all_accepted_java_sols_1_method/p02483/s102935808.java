import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=2;i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
	        System.out.printf("%d %d %d\n",a[0],a[1],a[2]);	
	}
}