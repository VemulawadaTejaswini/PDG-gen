

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();
		sb.append(in.next());
		int num = in.nextInt();

		for(int i = 0; i < num; i++){

			String command = in.next();

			if(command.equals("print")){

				int first_num = in.nextInt();
				int second_num = in.nextInt();

				System.out.println(sb.substring(first_num, second_num+1));

			}else if(command.equals("reverse")){

				int first_num = in.nextInt();
				int second_num = in.nextInt();

				StringBuilder reserve_sb = new StringBuilder();

				reserve_sb = sb;
				reserve_sb.reverse();
				String replace_word = reserve_sb.substring(first_num, second_num+1);
				sb = sb.replace(first_num, second_num+1, replace_word);

			}else if(command.equals("replace")){

				int first_num = in.nextInt();
				int second_num = in.nextInt();
				String str = in.next();

				sb.replace(first_num, second_num+1, str);

			}
		}
	}
}