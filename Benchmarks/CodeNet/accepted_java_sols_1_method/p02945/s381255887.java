import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int plus = a + b;
        int minus = a -b;
        int kakeru = a*b;
        int result = 0; 
        if(plus<minus){
            result = minus;
        }else{
            result = plus;
        }

        if(result<kakeru){
            result = kakeru;
        }
        System.out.println(result);
    }
}