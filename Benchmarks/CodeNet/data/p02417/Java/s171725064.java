import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strIn = "";
		int[] array = new int[26];
		int intTemp;
		while(scan.hasNext()){
			strIn += scan.nextLine();
		}
		for(int i = 0; i < strIn.length(); i++){
			intTemp = strIn.charAt(i);
			if('A' <= intTemp && intTemp <= 'Z'){
				array[intTemp - 'A']++;
			}else if('a' <= intTemp && intTemp <= 'z'){
				array[intTemp - 'a']++;
			}
		}
		for(int i = 0; i < array.length; i++){
			System.out.println((char)('a' + i) + " : " + array[i]);
		}

		scan.close();
	}
}