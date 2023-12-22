import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int len = S.length();
        int[] A = new int[len];
        for(int i = 0; i < len; i++){
            if(S.charAt(i) == 'B'){
                A[i] = 1; //黒は1
            } else {
                A[i] = 0; //白は0
            }
        }
        int ans = 0;
        while(true){
            int i = 0;
            if(A[0] == 1){
                for(i = 0; i < len && A[i] != 0; i++){
                    A[i] = 0;
                }
            } else {
                for(i = 0; i < len && A[i] != 1; i++){
                    A[i] = 1;
                }
                
            }
            ans++;
            if(i == len){
                ans--;
                break;
            }
            if(A[len - 1] == 1){
                for(i = len-1; i >= 0 && A[i] != 0; i--){
                    A[i] = 0;
                }
            } else {
                for(i = len - 1; i >= 0 && A[i] != 1; i--){
                    A[i] = 1;
                }
            }
            ans++;
            if(i == -1){
                ans--;
                break;
            }
        }
        System.out.println(ans);
    }
}
