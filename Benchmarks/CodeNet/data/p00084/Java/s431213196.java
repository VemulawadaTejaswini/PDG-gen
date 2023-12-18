import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		String[] word = scan.nextLine().split(" ");

		for(int i=0;i<word.length;i++){
			word[i]=word[i].replace(",", "");
			word[i]=word[i].replace(".", "");

			if(word[i].length()>=3 && word[i].length()<=6){
				if(i!=0)
					System.out.print(" ");
				System.out.print(word[i]);
			}
		}
	}

}