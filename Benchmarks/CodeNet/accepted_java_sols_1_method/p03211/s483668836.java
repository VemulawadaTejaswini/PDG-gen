import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();
        int min = 999;
        for(int i = 2; i < S.length(); i++){
            int n = Integer.parseInt(S.substring(i-2, i+1));
            int diff = Math.abs(753 - n);
            if(diff < min){
                min = diff;
            }
        }
        System.out.println(min);
    }

}