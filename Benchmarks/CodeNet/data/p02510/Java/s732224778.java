import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		for(;;){
			Scanner sc = new Scanner(System.in);
				String str = sc.nextLine();
					if(str.equals("-"))break;
				int shuffle_times = sc.nextInt();
					String result = str;
			for(int i = 0;shuffle_times != i;i++){
				int shuffle_num = sc.nextInt();
				String right = result.substring(shuffle_num, str.length());
				String left = result.substring(0, shuffle_num);
					result = right + left;
			}
			System.out.println(result);
		}
	}
}