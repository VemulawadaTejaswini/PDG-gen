
import java.util.*;


class Main {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        String ret="No";
        if(n==b){
            if(n!=a){
                ret="Yes";
            }
        }
        if(n==a){
            if(n!=b){
                ret="Yes";
            }
        }
        if(b==a){
            if(n!=b){
                ret="Yes";
            }
        }
        System.out.println(ret);

    }
}