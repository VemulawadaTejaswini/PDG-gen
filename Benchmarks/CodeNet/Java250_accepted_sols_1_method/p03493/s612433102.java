import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		int cnt=0;
		for(int i=0;i<3;i++){
			if(input.charAt(i)=='1'){
				cnt++;
			}
		}
		System.out.println(cnt);
		scanner.close();
	}
}