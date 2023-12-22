import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        int numBC = 0;
        boolean bc = false;
        long ans = 0;
        for(int i = line.length()-1;i >= 0;i--){
            if(bc) {
                if (i != 0 && line.charAt(i - 1) == 'B' && line.charAt(i) == 'C') {
                    i--;
                    numBC++;
                } else if(line.charAt(i) == 'A'){
                    ans += numBC;
                } else {
                    numBC = 0;
                    bc = false;
                }
            } else {
                if (i != 0 &&  line.charAt(i - 1) == 'B' && line.charAt(i) == 'C') {
                    bc = true;
                    i--;
                    numBC++;
                }
            }
        }

        System.out.println(ans);
    }
}