import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true){	
				String str = sc.nextLine();
					if(str.equals("-"))break;
				int shuffle_times = sc.nextInt();
			for(int i = 0;shuffle_times != i;i++){
				int shuffle_num = sc.nextInt();
					str = str.substring(shuffle_num, str.length()) + str.substring(0, shuffle_num);
			}
			System.out.println(str);
		}
	}
}