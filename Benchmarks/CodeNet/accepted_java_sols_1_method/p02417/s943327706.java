import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		String line = "";

		while(sc.hasNext()){
			line += sc.nextLine();
		}

		char[] ca = line.toCharArray();
		char[] al = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'
				, 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't'
				, 'u', 'v', 'w', 'x', 'y', 'z'};
		int[] count = new int[26];

		for(int i=0;i<ca.length;i++) {
			ca[i] = Character.toLowerCase(ca[i]);
			for(int j=0;j<26;j++) {
				if(ca[i]==al[j]) {
					count[j]+=1;
				}
			}
		}

		for(int i=0;i<26;i++) {
			System.out.println(al[i] + " : " + count[i]);
		}

		sc.close();
	}
}
