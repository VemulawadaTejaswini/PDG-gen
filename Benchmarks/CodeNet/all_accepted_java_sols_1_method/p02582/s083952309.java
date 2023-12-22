import java.util.*;

public class Main {
	public static void main(String[] args){
 
        Scanner sc = null;
        sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String before = "";
        int ans = 0;

        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                if(s.substring(0,1).equals("R")){
                    ans = 1;
                }
                before = s.substring(0,1);
            } else {
                if (s.substring(i, i + 1).equals("R") && before.equals("R")) {
                    ans += 1;
                }else if(s.substring(i, i + 1).equals("R") && before.equals("S")){
                    ans = 1;
                }
                before = s.substring(i, i + 1);
            }
        }

        System.out.println(ans);   
      }
}