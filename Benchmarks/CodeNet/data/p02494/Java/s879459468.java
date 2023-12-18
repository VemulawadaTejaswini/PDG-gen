import java.util.Scanner;
  
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int x = sc.nextInt() ;
int y = sc.nextInt() ;
for ( int a = 0; a < x; a++){
for ( int b = 1; b < y; b++){
System.out.print("#");
}
System.out.println("#");
}
}
}