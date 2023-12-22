import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner meow =new Scanner (System.in);
    int A=meow.nextInt();
    int B=meow.nextInt();
    int C=meow.nextInt();
    if(B>=A&&B>=C)
    System.out.println(A+(B*10)+C);
    else if(A>=B&&A>=C)
    System.out.println((A*10)+B+C);
    else
    System.out.println(A+(C*10)+B);
     
  }
      }
  