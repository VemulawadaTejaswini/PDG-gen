import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = "";
		/*while(scn.hasNext())*/ str += scn.nextLine();
		str = str.toLowerCase();
		char[] charray = str.toCharArray();
		Arrays.sort(charray);
		int i = 0;
		for(char ch = 'a'; ch <= 'z'; ch++){
			System.out.print(ch + " : ");
			while(i < charray.length && charray[i] < ch) i++;
			int cnt = 0;
			while(i < charray.length && charray[i] == ch){
				i++;
				cnt++;
			}
			System.out.println(cnt);
		}
	}
}