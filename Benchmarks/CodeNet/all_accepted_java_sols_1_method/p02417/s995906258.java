import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		String s = sc.nextLine();
		while(sc.hasNextLine()){
			s += sc.nextLine();
		}
		int[] ans = new int[26];
		int count;

		for(int i=0;i<alphabet.length();i++) {
			count = 0;
			for(int j=0;j<s.length();j++) {

				if(alphabet.substring(i, i+1).equalsIgnoreCase(s.substring(j,j+1))) {
					count++;
				}

			}
			ans[i] = count;
		}

		for(int i=0;i<ans.length;i++) {
			System.out.println(Character.toLowerCase(alphabet.charAt(i)) + " : " + ans[i]);
		}

		sc.close();
	}

}
