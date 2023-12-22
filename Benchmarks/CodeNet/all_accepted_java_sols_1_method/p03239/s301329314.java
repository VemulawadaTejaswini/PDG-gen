import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int min = 9999;
        for(int i=0; i<n; i++) {
            int cc = sc.nextInt();
            int tt = sc.nextInt();
            if(tt <= t) {
                min = Math.min(min, cc);
            }
        }

        if(min == 9999) {
            System.out.println("TLE");

        } else {
            System.out.println(min);
        }
    }

}
