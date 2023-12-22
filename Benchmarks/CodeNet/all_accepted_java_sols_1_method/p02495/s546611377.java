import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0&&w==0) break;
			
			for(int i=0; i<h; i++){
				if(i%2==0){
					for(int j=0; j<w; j++){
						if(j%2==0) System.out.printf("#");
						else System.out.printf(".");
					}
					System.out.println();
				}else{
					for(int j=0; j<w; j++){
						if(j%2==1) System.out.printf("#");
						else System.out.printf(".");
					}
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}