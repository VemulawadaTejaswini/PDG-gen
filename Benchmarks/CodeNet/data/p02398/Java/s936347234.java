import java.util.*;
import java.util.stream.*;
class Main {
    public static ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> div = new ArrayList<Integer>();
        for (int i = 1; i < (int)Math.pow(n,0.5)+1;i++){
            if (n%i == 0){
                div.add(i);
                if (i != n/i){
                    div.add((int)n/i);
                }
            }
        }
        return div;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        ArrayList<Integer> div = divisors(c);
        int ans = 0;
        for (int i = a; i < b+1; i++){
            for (int j = 0; j < div.size(); j++){
                if (i == div.get(j)){
                    ans += 1;
                }
            }
        }
        System.out.println(ans);
    }
}
