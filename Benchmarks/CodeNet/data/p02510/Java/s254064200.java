import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		for(;;){
			Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
					if(str.equals("-"))break;
				int shuffle_times = sc.nextInt();
			for(int i = 0;shuffle_times != i;i++){
				int shuffle_num = sc.nextInt();
				String right = str.substring(shuffle_num, str.length());
				String left = str.substring(0, shuffle_num);
					str = right + left;
			}
			System.out.println(str);
		}
	}
}