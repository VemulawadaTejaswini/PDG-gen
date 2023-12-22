import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s=scan.next();
		String t=scan.next();
		int count=0;
		
		char[] c = s.toCharArray();
		char[] d = t.toCharArray();
		
        for(int i=0; i<s.length();i++) {
            if(c[i]!=d[i])	count++;
        }
        
        System.out.println(count);
	}

}
