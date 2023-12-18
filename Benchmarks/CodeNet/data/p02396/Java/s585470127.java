import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int x = 0;
		for(int i = 1; i < 10000; i++){
			x = sc.nextInt();
			StringBuilder str = new StringBuilder(16);
			str.append("Case ");
			str.append(i);
			str.append(": ");
			str.append(x);
			
			if(x == 0){
			break;
			}
			System.out.println(str.toString());
			System.out.println(str.capacity());
			
		}
	sc.close();
	}
}