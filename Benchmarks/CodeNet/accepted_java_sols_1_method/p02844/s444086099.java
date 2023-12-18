import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String s = sc.next();
		int ans=0;

		for (int i=0; i<1000; i++){
			String pin = String.format("%03d", i);
			int index1 = s.indexOf(pin.charAt(0));
			if (index1 == -1){
				continue;
			}
			int index2 = s.indexOf(pin.charAt(1), index1 + 1);
			if (index2 == -1){
				continue;
			}
			int index3 = s.indexOf(pin.charAt(2), index2 + 1);
			if (index3 == -1){
				continue;
			}
			ans++;
		}
		System.out.println(ans);
	}
}