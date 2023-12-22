import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean judge1 = (a==b&&b!=c)||(a==c&&a!=b)||(b==c&&a!=b);
        boolean judge2 = !(a==b && b==c);
        if(judge1 && judge2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}