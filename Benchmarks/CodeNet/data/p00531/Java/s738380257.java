import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();

        int Xprice; int Yprice;
        //X
        Xprice=a*p;
        //Y
        if(p>c){ Yprice=b+d*(p-c); }
        else{ Yprice=b; }

        if(Xprice<=Yprice){ System.out.println(Xprice); }
        else{ System.out.println(Yprice); }
    }
}
