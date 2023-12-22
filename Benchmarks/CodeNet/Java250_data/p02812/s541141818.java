import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //A - 500 Yen Coins	   
        // int k = sc.nextInt();
        // int x = sc.nextInt();
        // boolean flg = false;
        // if(k*500>=x) {
        //     // System.out.println("k:"+k*500+"x:"+x);
        //     System.out.println("Yes");
        // } else {
        //     // System.out.println("k:"+k*500+"x:"+x);
        //     System.out.println("No");
        // }

        //B - Count ABC
        int n = sc.nextInt();
        String str = sc.nextLine();
        String s = sc.nextLine();
        int result = 0;
        int cnt = 0;
        while(true) {
            result = s.indexOf("ABC");
            if(result==-1) {
                // System.out.println("in");
                break;
            }
            // System.out.println("cnt:"+cnt);
            s = s.substring(result+3);
            // System.out.println("S:"+s);
            cnt++;
        }
        System.out.println(cnt);

    }
}