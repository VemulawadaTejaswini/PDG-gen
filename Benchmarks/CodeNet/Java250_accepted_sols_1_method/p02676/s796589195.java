import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		String moji=sc.next();
		String s=moji.toLowerCase();

    if(k>=1&&k<=100) {
	      if(s.length()>=1&&s.length()<=100) {
	    		if(k>=s.length()) {
	    			System.out.println(s);
	    		}else if(s.length()>=k) {
	    			String result=s.substring(0,k);
	    			System.out.println(result+"...");
	    		}
	    }

      }
  }
}