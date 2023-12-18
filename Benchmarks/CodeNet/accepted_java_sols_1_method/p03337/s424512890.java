import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sub = A - B;
        int add = A + B;
        int mul = A * B;
        if(sub > add){
            if(sub < mul){
                System.out.println(mul);
            }else{
                System.out.println(sub);
            }
        }else{
            if(add < mul){
                System.out.println(mul);
            }else{
                System.out.println(add);
            }
        }
    }
}