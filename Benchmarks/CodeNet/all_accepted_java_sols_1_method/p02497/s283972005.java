import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int f = scn.nextInt();
		int r = scn.nextInt();
		while(m != -1 || f != -1 || r != -1){
			if(m == -1 || f == -1 || m + f < 30){
				System.out.println("F");
			}else if(m + f < 50 && r < 50){
				System.out.println("D");
			}else if(m + f >= 80){
				System.out.println("A");
			}else if(m + f >= 65){
				System.out.println("B");
			}else{
				System.out.println("C");
			}
			m = scn.nextInt();
			f = scn.nextInt();
			r = scn.nextInt();
		}
	}

}