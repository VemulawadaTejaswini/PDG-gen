import java.util.Scanner;

/**
 *
 */

/**
 * @author bluen
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
//		int b=scanner.nextInt();

		for(int i=0;i<10;i++) {
			if(i*1000>=a) {
				System.out.println(i*1000-a);
				break;
			}
		}

		}


	}



