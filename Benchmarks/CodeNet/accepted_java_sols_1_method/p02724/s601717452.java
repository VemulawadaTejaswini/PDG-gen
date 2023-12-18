import java.util.Scanner;
class Main{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);
int X =sc.nextInt();

int tho = X/500;
int A =X-500*tho;
int five = A/5;
  
int ans=tho*1000+five*5;

System.out.println(ans);
}
}