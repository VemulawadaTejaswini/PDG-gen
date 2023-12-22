import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();

int sum=0;
if(a==b&&a!=c){
  sum=1;
}else if(a==c&&a!=b){
  sum=1;
}else if(b==c&&a!=b){
  sum=1;
}
  
if(sum==1){
System.out.println("Yes");
}else{
  System.out.println("No");
}
}
}