import java.util.*;

public class Main{

    void solve(){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int out = 0;
        for(int i = a; i <= b; i++){
            StringBuilder s = new StringBuilder(Integer.toString(i));
            if(s.toString().equals(s.reverse().toString())) out++;
        }
        System.out.println(out);
    }


    public static void main(String[] args){
        new Main().solve();
    }
}
