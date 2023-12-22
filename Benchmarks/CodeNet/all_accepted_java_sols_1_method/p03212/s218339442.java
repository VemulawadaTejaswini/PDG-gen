import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // String n = sc.next();
        sc.close();

        int ans = 0;
        for(int i=0; i<1000000; i++){
            String s = Integer.toString(i, 4);
            s = s.replace('2', '5');
            s = s.replace('3', '7');
            s = s.replace('1', '3');
            if(Long.parseLong(s) > n){
                break;
            }
            boolean[] exist = new boolean[4];
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == '3') exist[0] = true;
                if(s.charAt(j) == '5') exist[1] = true;
                if(s.charAt(j) == '7') exist[2] = true;
                if(s.charAt(j) == '0') exist[3] = true;
            }
            if(exist[0] && exist[1] && exist[2] && !exist[3]){
                ans++;
            }
        }

        System.out.println(ans);

        // long[] num = new long[9];
        // num[0] = 0;
        // num[1] = 0;
        // num[2] = 6;
        // for(int i=3; i<9; i++){
        //     num[i] = Math.pow(3, i+1) - 3*Math.pow(2, i+1) + 3;
        // }

        // String s = (String)n;
        // long ans = 0;
        // for(int i=0; i<s.length() - 1; i++){
        //     ans += num[i];
        // }

        // for(int =0; <; ++){
            
        // }
    }
}