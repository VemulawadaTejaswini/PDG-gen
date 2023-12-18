import java.util.Scanner;
class Main{
public static void main (String[] args){
Scanner scan = new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=a-b;
switch(c){
case c>0: System.out.println("a > b");
          break;
case c==0: System.out.println("a == b");
          break;
case c<0: System.out.println("a < b ");
          break;
default:  break;
}
}
}