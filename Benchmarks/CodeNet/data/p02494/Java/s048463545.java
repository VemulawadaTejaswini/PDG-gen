import java.util.Scanner;
public class AOJ112 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);			
		sc.useDelimiter("\\s"); 
		while(true){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==0 && y==0)break;
			for(int j=0;j<x;j++){
				for(int i=0;i<y;i++){
					System.out.print("#");
					if(i==(y-1))System.out.printf("\n");
				}
			}
			System.out.printf("\n");
		}
		sc.close();
		System.exit(0);
	}
}