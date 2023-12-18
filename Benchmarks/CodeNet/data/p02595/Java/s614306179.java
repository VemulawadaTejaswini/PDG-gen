import java.util.*;

public class Main{

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(B());
    }

    public static String A() {
        int input = sc.nextInt();
        if(input >= 30){
            return "Yes";
        }
        else{
            return "No";
        }
    }

    public static int B(){
        int N = sc.nextInt();
        int D = sc.nextInt();
        int cnt = 0;

        for ( var i = 0; i< N; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            double num = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            if(num<=D){
                cnt++;
            }
        }

        return cnt;
    }
}
