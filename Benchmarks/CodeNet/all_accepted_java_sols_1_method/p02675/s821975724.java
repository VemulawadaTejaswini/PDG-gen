import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
    Scanner obj = new Scanner(System.in);   
    int n=obj.nextInt();
    int m=n%10;
    if(m==2||m==4||m==5||m==7||m==9)
    {
        System.out.print("hon");
    }
    else if(m==0||m==1||m==6||m==8)
    {
        System.out.print("pon");
    }
    else
    {
        System.out.print("bon");
    }
}
}