import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int []pen = new int[3];
		for(int i = 0; i < 3; i++) {
			pen[i] = stdIn.nextInt();
		}
		int cnt = 3;
		if(pen[0]==pen[1]) {
			cnt--;
		}
		if(pen[1]==pen[2]) {
			cnt--;
		}
		if(pen[0]==pen[2]) {
			cnt--;
		}
		if(pen[0]==pen[1] && pen[1] ==pen[2]) {
			System.out.println(1);
			System.exit(0);
		}
		System.out.println(cnt);
	}

}
