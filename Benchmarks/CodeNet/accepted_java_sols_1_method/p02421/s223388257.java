import java.util.Scanner;
public class Main {
    public static void main(String[] defargs) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int taro = 0;
		int hana = 0;
		for (int i = 0; i < n; i++) {
			String card1 = scanner.next();
			String card2 = scanner.next();
			if(card1.compareTo(card2) > 0){
				taro = taro + 3;
			}else if (card1.compareTo(card2) < 0) {
				hana = hana + 3;
			}else {
				taro = taro + 1;
				hana = hana + 1;
			}
		}
		System.out.println(taro +" "+ hana);
	}
}
