
import java.util.Scanner;
class Main{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);
int X =sc.nextInt();
int Y =sc.nextInt();
int Z =sc.nextInt();


int num=Y;
Y = X;
int ans =Z;
Z = num;

System.out.println(ans);
System.out.println(Y);
System.out.println(Z);

}
}