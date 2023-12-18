import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int s = a1+a2+a3;
        if(s >= 22){
            System.out.println("bust");
        }else{
            System.out.println("win");
        }

    }
}