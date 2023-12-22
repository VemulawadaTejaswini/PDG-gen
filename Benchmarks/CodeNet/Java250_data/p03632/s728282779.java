import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        if(a < c){
            if(b < c){
                ans = 0;
            }else{
                if(b < d){
                    ans = b -  c;
                }else{
                    ans = d - c;
                }
            }
        }else{
            if(d < a){
                ans = 0;
            }else{
                if(b < d){
                    ans = b -a;
                }else{
                    ans = d - a;
                }
            }
        }
        System.out.println(ans);
    }
}