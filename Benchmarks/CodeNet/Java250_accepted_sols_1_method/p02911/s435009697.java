import java.util.*;

class Main{
    public static void main(String[] args) {       
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int q = stdIn.nextInt();
        int win[] = new int [n];
        for(int i = 0; i < q; i++)
            win[stdIn.nextInt() - 1]++;
        for(int i = 0; i < n ; i++){
            System.out.println(k - (q-win[i]) <= 0 ?  "No" :"Yes");
        }

   }
}
