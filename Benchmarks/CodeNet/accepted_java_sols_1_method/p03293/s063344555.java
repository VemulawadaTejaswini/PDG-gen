import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static long N;
    static int M;
    static int A;
    static long B;
    static long C;
    static int[][] map;
    static int min = 9999999;
    static int[] moto = new int[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int ok = 0;
            for (int j = 0; j < s.length(); j++) {
//                System.out.println(" ==  " + s.charAt(i));
                if(s.charAt(j) == (t.charAt((i + j) % s.length()))) {
                    ok++;
//                    System.out.println(s.charAt(i));
                }
            }
            if(ok == s.length()){
                ans = 1;
                break;
            }
        }

        if(ans == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }




}

