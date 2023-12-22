import java.util.Scanner;
public class Main {
public static void main(final String[] args) {
    final Scanner scan = new Scanner(System.in);

    final int N = scan.nextInt();

    final int num = N % 10;
scan.close();
if((num==2) ||(num==4)||(num==5)||(num==7)||(num==9)){
    System.out.println("hon");
}else if((num==0)||(num==1)||(num==6)||(num==8)){
    System.out.println("pon");
}else 
System.out.println("bon");
}
}