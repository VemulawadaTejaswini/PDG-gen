import java.util.Scanner;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);

int h=scan.nextInt();
int a=scan.nextInt();

int sum=0;
  if(h%a==0){
    sum=h/a;
  }else{
    sum=h/a+1;
  }
  System.out.println(sum);
}
}
