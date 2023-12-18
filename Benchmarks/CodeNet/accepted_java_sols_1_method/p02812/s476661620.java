import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int result = 0;
        for (int i = 0;i<N;i++){
            if(S.charAt(i) == 'A'&&i<=N-3){
                if(S.charAt(i+1)=='B'){
                    if(S.charAt(i+2)=='C'){
                        result++;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
