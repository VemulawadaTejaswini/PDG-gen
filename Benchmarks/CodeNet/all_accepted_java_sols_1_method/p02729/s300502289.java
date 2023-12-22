import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int answer = (n*(n-1))/2 + (m*(m-1))/2;
		System.out.println(answer);
	}

}
