import java.util.Scanner;
class Main{
	
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
String op=sc.next();
int B=sc.nextInt();

System.out.println(op.equals("+")? A+B :A-B);   

 }
  }

 