import java.util.*;


public class Main {
    
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int num = sc.nextInt();
        int sum;
        int um = (int)Math.pow(2,num);
        
        if (a>b && a>c){
            sum = a * um + b + c;
        }else if(b>a && b>c){
            sum = b * um + a + c;
        }else{
            sum = c * um + a + b;
        }
        
        System.out.println(sum);
    }
}