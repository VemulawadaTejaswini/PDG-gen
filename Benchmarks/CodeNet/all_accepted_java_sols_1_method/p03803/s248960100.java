import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "";
        if(a==1)
            a=14;
        if(b==1)
            b=14;
        
        if(a>b)
            ans = "Alice";
        else if(a<b)
            ans = "Bob";
        else
            ans = "Draw";

        System.out.println(ans);
        
    }
}