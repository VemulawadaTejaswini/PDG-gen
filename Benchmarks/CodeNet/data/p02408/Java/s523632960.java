import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int n=sc.nextInt();
		int[][] a=new int[4][13];
		for(int i=0;i<n;i++){
			String shape=sc.next();
			int num=sc.nextInt();
			if(shape.equals("S")) a[0][num]=1;
			if(shape.equals("H")) a[1][num]=1;
			if(shape.equals("C")) a[2][num]=1;
			if(shape.equals("D")) a[3][num]=1;
		}
		sc.close();
		for(int i=0;i<13;i++){
			if(a[0][i]==0) System.out.println("S "+i);
		}
		for(int i=0;i<13;i++){
			if(a[1][i]==0) System.out.println("H "+i);
		}
		for(int i=0;i<13;i++){
			if(a[2][i]==0) System.out.println("C "+i);
		}
		for(int i=0;i<13;i++){
			if(a[3][i]==0) System.out.println("D "+i);
		}
		}
}