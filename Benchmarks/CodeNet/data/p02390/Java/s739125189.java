import java.util.Scanner;
class Main{
public static void main (String[] args){
Scanner scan = new Scanner(System.in);
int S=scan.nextInt();
int M=S/60;
int s=S%60;
int h=M/60;
int m=M%60;
System.out.println(h+":"+m+":"+s);
}
}