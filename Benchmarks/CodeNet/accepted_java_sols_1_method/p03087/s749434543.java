import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int quiz_num = sc.nextInt();
        String str = sc.next();
        char[] seq = str.toCharArray();
        
        int[] DP = new int[seq.length];
        int cnt = 0;
        boolean flg = false;
        for(int i = 0; i < seq.length; i++){
                if(seq[i] == 'C' && flg){
                    cnt++;
                    flg = false;
                } else if(seq[i] == 'A'){
                    flg = true;
                } else{
                    flg = false;
                }
                DP[i] = cnt;
            }
        
        int start = 0;
        int end = 0;

        for(int n = 0; n < quiz_num; n++){
            start = sc.nextInt();
            end = sc.nextInt();
            
            System.out.println(DP[end-1] - DP[start-1]);
        }
    }
}