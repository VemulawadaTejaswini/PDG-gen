import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int result010 = 0;
        int result101 = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(i%2==0) {
                if(c=='0') {
                    result101++;
                }
                else {
                    result010++;
                }
            }
            else {
                if(c=='0') {
                    result010++;
                }
                else {
                    result101++;
                }
            }
        }
        System.out.println(Math.min(result010, result101));
    }
}
