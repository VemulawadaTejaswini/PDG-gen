import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        String N = sc.next(),ans;
        int comp;
        N = N.substring(N.length()-1);
        comp = Integer.valueOf(N);
        if(comp == 3){
            ans = "bon";
        }else if(comp <= 1 || comp == 6 || comp == 8){
            ans = "pon";
        }else{
            ans = "hon";
        }
        System.out.println(ans);
    }
}






