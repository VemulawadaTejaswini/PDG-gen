import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
        
        StringBuilder sb = new StringBuilder(N);
        char C = S.charAt(K - 1);
        for(int i = 0; i < N; i++){
            char tmp = S.charAt(i);
            if(tmp == C){
                sb.append(tmp);
            }else{
                sb.append("*");
            }
        }
        System.out.println(sb.toString());
    }
}
