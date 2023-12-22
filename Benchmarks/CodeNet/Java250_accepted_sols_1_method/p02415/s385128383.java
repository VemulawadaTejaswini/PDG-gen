import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 String moji=sc.nextLine();
		 for(int i=0;i<moji.length();i++) {
			 char c=moji.charAt(i);
			 if('a'<=c && c<='z') System.out.print((char)(c-32));
			 else if ('A'<=c && c<='Z')System.out.print((char)(c+32));
			 else System.out.print(c);
		 }
		 System.out.println();

		 sc.close();
	 }
}

