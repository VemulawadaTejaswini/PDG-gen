import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
 
public class Main {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
	int n=ob.nextInt();
	int k=0;
	for(int i=0;i<n;i++)
	{
	int a=ob.nextInt();
	int b=ob.nextInt();
	if(a==b){k++;}
	else{k=0;}
	if(k==3){System.out.println("Yes");System.exit(0);}
	}
		System.out.println("No");
	}
}