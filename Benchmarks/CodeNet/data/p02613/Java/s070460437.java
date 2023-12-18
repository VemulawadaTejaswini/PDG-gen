import java.util.*;
public class Main {
	public static void main(String[] args){
	        Scanner console = new Scanner(System.in);
	        int N = Integer.valueOf(console.nextLine()); // 文字数
	        String S = console.nextLine(); // AとBの並び
      		
      		int ac = 0;
      		int wa = 0;
      		int tle = 0;
            int re = 0;
      		for (int i = 0; i < N; i++) {
              String S = sc.nextLine();
			  if(S.equals("AC")) {
                ac++;
              } if else(S.equals("WA")) {
                wa++;
              } if else(S.equals("TLE")) {
                tle++;
              } else {
                re++;
              }
            }
              System.out.println("AC x " ac);
              System.out.println("WA x " wa);
              System.out.println("TLE x " tle);
              System.out.println("RE x " re);
    }
}
