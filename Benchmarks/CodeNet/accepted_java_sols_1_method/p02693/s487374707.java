import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int k=scan.nextInt();
int a=scan.nextInt();
int b=scan.nextInt();

int sum=0;
if(a%k==0){
    sum=sum+1;
}else if(b%k==0){
    sum=sum+1;
}else if(b/k-a/k>=1){
    sum=sum+1;
}

if(sum==1){
    System.out.println("OK");
}
if(sum==0){
    System.out.println("NG");
}

}
}