import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        a=a % 10;
        if (a==2 ||a==4||a==5||a==7||a==9){
            System.out.println("hon");
        }else if(a==0 ||a==1||a==6||a==8){
            System.out.println("pon");
        }else{
            System.out.println("bon");
        }

    }
}