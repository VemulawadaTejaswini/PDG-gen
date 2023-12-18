import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int b;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        b=1;
        for(int i=0;i<3;i++){
            b*=a;
        };
        System.out.println(b);
    }
}