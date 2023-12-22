import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] charArray = s.toCharArray();
		char[] notModify = new char[s.length() - 4];
		for(int i = 0 ; i < notModify.length ;i++){
			notModify[i] = charArray[i + 4];
		}
		String notModified = "";
		for(int i = 0 ; i < notModify.length ;i++){
			notModified = notModified + String.valueOf(notModify[i]);
		}
		System.out.println("2018" + notModified);
	}
}