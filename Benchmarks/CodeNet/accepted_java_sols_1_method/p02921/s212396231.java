import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        
        int seikai = 0;
        String Sichimojime = S.substring(0, 1);
        String Snimojime = S.substring(1, 2);
        String Ssanmojime = S.substring(2, 3);
        
        String Tichimojime = T.substring(0, 1);
        String Tnimojime = T.substring(1, 2);
        String Tsanmojime = T.substring(2, 3);
        
        if(Sichimojime.equals(Tichimojime)) {
        	seikai++;
        }
        if(Snimojime.equals(Tnimojime)) {
        	seikai++;
        }
        if(Ssanmojime.equals(Tsanmojime)) {
        	seikai++;
        }

        System.out.println(seikai);

	}

}