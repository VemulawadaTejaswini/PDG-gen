import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        String ans = "";
        long a = sc.nextLong();
        Long z = a;
        String[] array = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        int b = 1;
        do{
            b++;
            z /= 26;
        } while(z >= 27);
        if(a % 26 == 0){
            b--;
            for (int i = 0; i < b; i++) {
                ans += "z";   
            }
        }else{
            String x[] = new String[b];
            for (int i = b-1; i >= 0; i--) {
                long c = a % 26;
                if(c == 0)c = 26;
                x[i]= array[(int)c-1];
                a /= 26;
            }
            for (String s : x) {
                ans += s;
            }
        }
        System.out.println(ans);
    }
}






