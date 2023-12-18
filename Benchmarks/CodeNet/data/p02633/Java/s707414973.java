import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
        int cnt = Integer.parseInt(sn.next());
        if (cnt > 90){
            System.out.println(360 / (cnt - 90));
        } else {
            System.out.println(360 / cnt);
        }
	}
}

