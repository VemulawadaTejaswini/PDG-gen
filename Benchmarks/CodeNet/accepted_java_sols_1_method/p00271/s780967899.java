import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        for(int i=0;i<7;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a-b);
        }
    }
}