import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();

		int[] abcArray = new int[26];
		byte[] asciiCodes = {65};
		try{
			asciiCodes = input.getBytes("US-ASCII");
		}catch(Exception e){
			System.out.println(e.toString());
		}
		for(int i = 0; i < asciiCodes.length; i++){
			int index = (int)asciiCodes[i] - 97;
			abcArray[index]++;
		}
		boolean isOk = true;
		for(int i = 0; i < abcArray.length; i++){
			if(abcArray[i] > 1){
				isOk = false;
			}
		}
		if(isOk){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
	}

}
