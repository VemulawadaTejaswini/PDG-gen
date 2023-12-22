import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        int res = 0;

        for(int i=1; i<=n; i++) {
            int l = Integer.toString(i).length();
            if(l % 2 == 1) res ++;
        }
        System.out.println(res);

    }


}
