import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int y=n/15;
        int foodbill=800*n-200*y;
        System.out.println(foodbill);
    }
}