import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    int a=input.nextInt();
    int b=input.nextInt();
    int c=input.nextInt();
    int k=input.nextInt();
    int result=0;
    if(k<=a){
    result+=k;
    System.out.print(result);
    }
    else if(k<=a+b){
    System.out.print(a);
    }
    else {
    result=2*a+b-k;
    System.out.print(result);
    }
    }
}