import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int k = 0;
		Scanner sc = new Scanner(System.in);
		int gyo = sc.nextInt();
		int retu = sc.nextInt();
		while (gyo != 0 || retu != 0){
			for(int i=0;i<gyo;i++){
				if(i==0 || i == gyo - 1) {
					for(int j=0;j<retu;j++){
						System.out.printf("#");
					}
				} else {
					System.out.printf("#");
					for(int j=2;j<retu;j++){
						System.out.printf(".");
					}
					System.out.printf("#");
				}
				System.out.println();
			}
			System.out.println();
			gyo = sc.nextInt();
			retu = sc.nextInt();
		}
	}
}
