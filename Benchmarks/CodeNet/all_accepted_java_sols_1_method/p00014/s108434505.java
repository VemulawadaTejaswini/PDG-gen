import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int d = sc.nextInt();
			int s = 0;
			for(int i=0; i<600/d; i++){
				s+= Math.pow(d*i,2)*d;
			}
			System.out.println(s);
		}
	}

}