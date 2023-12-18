import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        int assess=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a<=c) assess++;
        if(c<=b) assess++;

        if(assess==2) System.out.println("Yes");
        else System.out.println("No");
    }
}