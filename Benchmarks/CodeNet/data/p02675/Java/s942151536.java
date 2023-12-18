import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        int d=a%10;
        if((d==2)||(d==4)||(d==5)||(d==9)||(d==7))
            System.out.println("hon");
        if(d==3)
            System.out.println("bon");
        else
            System.out.println("pon");
    }
}



