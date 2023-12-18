import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		while(scan.hasNext()){
			int x=scan.nextInt();
			int y=scan.nextInt();
			if(x==0 && y==0)
				break;
			for (int i = 0; i < x; i++) {
				if(i%2!=0){
					boolean c=false;
					for (int j = 0; j < y; j++) {
						if(c){
							System.out.print("#");
							c=false;
						}else{
							System.out.print(".");
							c=true;
						}
						
					}
				}else{
					boolean c=false;
					for (int j = 0; j < y; j++) {
						if(c){
							System.out.print(".");
							c=false;
						}else{
							System.out.print("#");
							c=true;
						}
						
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}