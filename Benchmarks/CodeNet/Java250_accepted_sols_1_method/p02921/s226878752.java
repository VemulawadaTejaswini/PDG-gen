import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String S, T;
        S = sc.nextLine();
        T = sc.nextLine();

        int cnt = 0;

        char[] cS = S.toCharArray();
        char[] cT = T.toCharArray();

        for(int i = 0; i<3;i++){
            if(cS[i] == cT[i]){
                    cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
