import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        Long K = sc.nextLong();
        sc.close();
        int x =0;
        int idx = -1;
        for(int i = 0; i < S.length(); i++){
            if(S.charAt(i) != '1'){
                x = Integer.parseInt(String.valueOf(S.charAt(i)));
                idx = i;
                break;
            }
        }
        if(idx < 0 || idx >= K)System.out.println(1);
        else System.out.println(x);
    }

}
