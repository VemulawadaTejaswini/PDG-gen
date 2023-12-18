import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+max+1; j < n; j++) {
                if(0 < s.indexOf(s.substring(i, j), j)){
                    max = j - i;
                }else{
                    break;
                }
            }
        }
        System.out.println(max);
        sc.close();

    }

}
