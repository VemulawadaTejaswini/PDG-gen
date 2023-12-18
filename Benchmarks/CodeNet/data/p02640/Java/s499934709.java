import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Turu = (X*4-Y)/2;
		if(Turu<0){
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
		sc.close();
	}

}