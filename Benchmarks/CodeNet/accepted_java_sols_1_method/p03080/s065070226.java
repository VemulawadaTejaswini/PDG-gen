import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(stdR.readLine());
        String str = stdR.readLine();
        int R = 0;
        int B = 0;
        for(int i = 0 ; i < str.length(); i++) {
            if(str.charAt(i) == 'R') {
                R++;
            }else {
                B++;
            }
        }
        if(R > B) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}