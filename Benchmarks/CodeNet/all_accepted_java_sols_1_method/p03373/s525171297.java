import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        
        int ans;
        if(a+b > c*2){
            if(x > y){
                ans = y*c*2 + Math.min((x-y)*a, (x-y)*c*2);
            }else if(x < y){
                ans = x*c*2 + Math.min((y-x)*b, (y-x)*c*2);
            }else{
                ans = x*c*2;
            }
        }else{
            ans = a*x + b*y;
        }
        
        System.out.println(ans);
    }
}