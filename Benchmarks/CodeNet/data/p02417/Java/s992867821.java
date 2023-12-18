import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  while(sc.hasNext()) {
		  String str = sc.nextLine();
		  String s = str.toLowerCase();
		  int alphabet[] = new int[26];
	  	for (char i : s.toCharArray()) {
	  		if (i >= 97 && i <= 122) {
				alphabet[i - 97]++;
			}
		}
	  	for (int i = 0; i < alphabet.length; i++) {
			char j = (char) (i + 97);
			System.out.println(j + " : " + alphabet[i]);
	  	}
	}
	  sc.close();
  }
}
