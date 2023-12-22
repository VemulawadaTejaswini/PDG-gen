import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		int answer = H*W;
		answer = answer - h*W - w*H + h*w;
		System.out.println(answer);
	}

}
