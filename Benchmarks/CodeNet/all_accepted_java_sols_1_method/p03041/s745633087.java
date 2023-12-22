import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        for(int i=0;i<N;i++){
            String s = S.substring(i,i+1);
            if(i == K-1){
                System.out.print(s.toLowerCase());
            } else {
                System.out.print(s);
            }
        }




    }
}
