import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        sc.close();
        if(a*b%2==0)System.out.print("No");
        else System.out.print("Yes");
    }
}