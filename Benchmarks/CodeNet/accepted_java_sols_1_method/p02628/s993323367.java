import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int many = scan.nextInt();
		int kind = scan.nextInt();
		int yen;
		int[] yenbox = new int[many];
		for(int i=0;i<many;i++) {
			yen = scan.nextInt();
			yenbox[i] = yen;
		}
		int min;
		for(int i=0;i<many;i++) {
			for(int j=i;j<many;j++) {
				if(yenbox[i]>yenbox[j]) {
					min = yenbox[i];
					yenbox[i] = yenbox[j];
					yenbox[j] = min;
				}
			}
		}
		int answer = 0;
		for(int i=0;i<kind;i++) {
			answer += yenbox[i];
		}
		System.out.print(answer);
	}

}