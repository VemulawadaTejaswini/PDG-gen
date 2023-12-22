
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		sc.useDelimiter("\\s"); 
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=0;
			if(x==0 && y==0)break;
			for(int j=0;j<x;j++){
				for(int i=0;i<y;i++){
					if(z%2==0){
						System.out.print("#");
						z++;
					}
					else{
						System.out.printf(".");
						z++;
					}
				}
				System.out.printf("\n");
				if(j%2==0)z=1;
				else z=0;
			}
			System.out.printf("\n");
		}
		sc.close();
		System.exit(0);
	}
}