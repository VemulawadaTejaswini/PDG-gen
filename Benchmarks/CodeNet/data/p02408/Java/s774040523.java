import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		int n=sc.nextInt();
		boolean[][] a=new boolean[4][13];
		for(int i=0;i<n;i++){
			String shape=sc.next();
			int num=sc.nextInt();
			if(shape.equals("S")) a[0][num]=true;
			if(shape.equals("H")) a[1][num]=true;
			if(shape.equals("C")) a[2][num]=true;
			if(shape.equals("D")) a[3][num]=true;
		}
		sc.close();
		for(int i=0;i<13;i++){
			if(a[0][i]==false) System.out.println("S "+i);
		}
		for(int i=0;i<13;i++){
			if(a[1][i]==false) System.out.println("H "+i);
		}
		for(int i=0;i<13;i++){
			if(a[2][i]==false) System.out.println("C "+i);
		}
		for(int i=0;i<13;i++){
			if(a[3][i]==false) System.out.println("D "+i);
		}
		}
}