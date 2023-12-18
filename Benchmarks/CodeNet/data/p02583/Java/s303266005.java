import java.util.*;

public class Main {
    static int sum = 0;
    static int tmpSum = 0;
    static int count = 0;
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

         String[] charN = n.split("");
        solve(charN,0);
        System.out.println(count);
    }
    public static void solve(String[] n , int i) {
        if (i < n.length) {
            if (n[i].equals("R")) {
                i++;
                sum++;
            } else {
                if (tmpSum < sum) {
                    tmpSum = sum;
                    i++;
                }
            }
            solve(n, i);
        } else {
            count = tmpSum;
        }
    }
        
}