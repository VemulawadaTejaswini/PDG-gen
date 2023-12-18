import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        int x = Integer.parseInt(sn.next());
        int y = Integer.parseInt(sn.next());
		for( int i =0; i <= x ; i++ ){
            int t = 2 * i;
            int k = 4 * (x - i);
			if (t + k == y ){
                System.out.println("Yes");
                return;
			}
		}
        System.out.println("No");
	}
}

