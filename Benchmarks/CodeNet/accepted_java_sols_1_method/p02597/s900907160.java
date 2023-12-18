import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String s = sc.nextLine();
        int l = 0;
        int r = s.length() - 1;
        int cost = 0;
        while (r > l){
            while (s.charAt(l) == 'R'){
                l+=1;
                if(l == s.length()){
                    System.out.println(0);
                    System.exit(0);
                }
            }
            while (s.charAt(r) == 'W'){
                r-=1;
                if(r == -1){
                    System.out.println(0);
                    System.exit(0);
                }
            }
            if (r > l) {
                cost += 1;
                l += 1;
                r -= 1;
            }
        }
        System.out.println(cost);
    }
}
