import java.io.InputStreamReader;
import java.util.Scanner;
public class Main{
	public static void main (String args[]){
		Scanner sc=new Scanner(new InputStreamReader(System.in));
		while(true){
			int h=sc.nextInt();
			int w=sc.nextInt();
			if(h==0&&w==0) break;
			for(int i=0;i<w;i++) System.out.print("#");	
			System.out.println("");
			for(int i=2;i<=h-1;i++){
				System.out.print("#");
				for(int j=2;j<=w-1;j++) System.out.print(".");
				System.out.print("#");
				System.out.println("");
			}
			for(int i=0;i<w;i++) System.out.print("#");
			System.out.println("");
			System.out.println("");
		}
		sc.close();
	}
}