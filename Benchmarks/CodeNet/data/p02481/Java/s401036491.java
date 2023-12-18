import java.util.*;

public class Main {

	int n;
	int m;
	public void doIt(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		System.out.println(n*m + " "+ (n+m)*2);
	}

	public static void main(String[] args) {
		Main obj = new Main();
        obj.doIt();

	}

}