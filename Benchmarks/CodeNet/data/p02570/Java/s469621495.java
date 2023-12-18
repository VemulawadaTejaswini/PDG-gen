import java.util.*;
public class Main {
    public void solve() {
        Scanner scan = new Scanner(System.in);
        int D = scan.nextInt();
        int T = scan.nextInt();
        int S = scan.nextInt();
        if(D<=T*S){
            System.out.println("Yes");}
        else{
            System.out.println("No");
        }
        }
        public static void main(String[]args){
            new Main().solve();
        }
    }