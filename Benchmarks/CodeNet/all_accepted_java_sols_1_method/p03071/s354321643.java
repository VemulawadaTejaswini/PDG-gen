import java.util.Scanner;

public class Main{
	public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int c;
    int first;
    int second;
      
    if (B>=A){
     c=A;
     A=B;
     B=c;
    }
    first=A;
    A--;
      
    if (B>=A){
      c=A;
      A=B;
      B=c;
    }
      second=A;
      
      System.out.println(first+second);
      
    
    }
    }