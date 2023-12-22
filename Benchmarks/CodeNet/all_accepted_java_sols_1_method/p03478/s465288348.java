import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        long result = 0;
        for(int i = 1; i <= N; i++){
            String S = String.valueOf(i);
            long T = 0;
            for(int j = 0; j < S.length(); j++){
                T += Character.getNumericValue(S.charAt(j));
            }
            if(T >= A && T <= B){
                result += i;
            }
        }
        System.out.println(result);
    }
}
