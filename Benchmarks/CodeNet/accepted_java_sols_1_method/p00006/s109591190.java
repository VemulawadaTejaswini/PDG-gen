import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String moji;
		char[] charmoji;
		while(scan.hasNext() == true){
			moji = scan.next();
			charmoji = moji.toCharArray();
			for(int i = 0; i < charmoji.length/2; i++){
				char tmp = charmoji[i];
				charmoji[i] = charmoji[charmoji.length-1-i];
				charmoji[charmoji.length-1-i] = tmp;
			}
			moji = String.valueOf(charmoji);
			System.out.println(moji);
		}
		scan.close();
	}
}