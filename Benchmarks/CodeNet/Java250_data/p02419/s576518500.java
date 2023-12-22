import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Scanner scan = new Scanner(System.in);

		String str1 =scan.nextLine();

		String str2;

		int count =0;

		while (true) {

				str2 = scan.nextLine();

				/*System.out.print(str2);*/
				if (str2.equals("END_OF_TEXT")) {
					break;
				}
				Scanner sb = new Scanner(str2);
					while(sb.hasNext()){


/*					System.out.println(sb.next());
*/					if(sb.next().equalsIgnoreCase(str1)){
						count++;

					}
					}
		}

		System.out.println(count);
 }

}