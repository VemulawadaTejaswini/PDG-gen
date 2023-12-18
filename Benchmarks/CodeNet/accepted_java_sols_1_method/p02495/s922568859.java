
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		sc.useDelimiter("\\s"); 
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0 && y==0)break;
			for(int i=0;i<x;i++){
				for(int j=0;j<y;j++){
					if((j+i)%2==0)System.out.print("#");
					else System.out.print(".");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
		sc.close();
		System.exit(0);
	}
}