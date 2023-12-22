import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k;
        int x;
        k=sc.nextInt();
        x=sc.nextInt();
        if(k*500>=x){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}