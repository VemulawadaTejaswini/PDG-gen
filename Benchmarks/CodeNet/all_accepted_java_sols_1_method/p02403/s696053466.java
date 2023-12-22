import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int k = 0;
		Scanner sc = new Scanner(System.in);
		int gyo = sc.nextInt();
		int retu = sc.nextInt();
		while (gyo != 0 || retu != 0){
			for(int i=0;i<gyo;i++){
				for(int j=0;j<retu;j++){
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
