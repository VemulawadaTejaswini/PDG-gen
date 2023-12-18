import java.util.*;

class Main{
    static{
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans = 0;
        ans = a;
        if(b < a){
            ans--;
        }
        System.out.println(ans);
    }
    public static void main(String[] args){

    }
}