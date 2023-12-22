import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			String moji = scan.next();
			int moji_len = moji.length();
			for(int cnt_len = 0; cnt_len < moji_len; cnt_len++){
				char moji_one = moji.charAt(cnt_len);
				if(Character.isLowerCase(moji_one))
					System.out.print(Character.toUpperCase(moji_one));
				else
					System.out.print(Character.toLowerCase(moji_one));
			}
			//?????????????´???§???????????°?????????????????\??????
			if(scan.hasNext())
				System.out.print(" ");
			else{
				System.out.print("\n");
				break;
			}
		}
		//????§????
		scan.close();
	}
}