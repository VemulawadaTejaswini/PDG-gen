import java.util.*;
//System.out.println("")

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            a--;
            if(a>b){
                System.out.println(a+1+a);
            }else{
                System.out.println(a+1+b);
            }
        }else{
            b--;
            if(a>b){
                System.out.println(b+1+a);
            }else{
                System.out.println(b+1+b);
            }
        }
    }
}