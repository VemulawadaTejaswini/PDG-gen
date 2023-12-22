import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();

int ta;
  if(a%d==0){
    ta=a/d;
  }else{
    ta=a/d+1;
  }
int ao;
  if(c%b==0){
    ao=c/b;
  }else{
    ao=c/b+1;
  }
  
  
if(ta>=ao){
System.out.println("Yes");
}else{
System.out.println("No");
}
  
}
}