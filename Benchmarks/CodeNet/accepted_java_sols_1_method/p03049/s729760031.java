import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] s = new String[n];

        int ab = 0;
        int xa = 0;
        int bx = 0;
        int bxa = 0;

        for(int i = 0; i < n; i++){
            s[i] = sc.next();

            if(s[i].charAt(s[i].length() - 1) == 'A'){
                if(s[i].charAt(0) == 'B'){
                    bxa++;
                }else{
                    xa++;
                }
            }else if(s[i].charAt(0) == 'B'){
                bx++;
            }
            for(int j = 0; j < s[i].length(); j++){
                int index = s[i].indexOf("AB", j);
                if(index != -1){
                    j = index;
                    ab++;
                }else{
                    j = s[i].length();
                }
            }
        }

        if(bxa > 0){
            ab += bxa - 1;
            if(xa > 0){
                xa--;
                ab++;
            }
            if(bx > 0){
                bx--;
                ab++;
            }
        }
        ab += Math.min(xa, bx);
        System.out.println(ab);

    }

}
