import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int A = sc.nextInt();
  int B = sc.nextInt();
  int C = sc.nextInt();
  if(A+B+C == 17 &&((A==5 && B==7)||(A==7 && B==5)||(A==5 && B==5)))
    System.out.println("YES");
  else System.out.println("NO");
}
}
