import java.util.*;
public class Main{
 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a%2 != 0 || c%2 != 0 || b%2 != 0){
      System.out.println(0);
      System.exit(0);
    }
	int steps = 1;
    int d = a, e = b, f = c;
    int newA = (b/2)+(c/2);
    int newC = (b/2)+(a/2);
    int newB = (a/2)+(c/2);
    a=newA;
    b=newB;
    c=newC;
    while(a%2 ==0 && c%2 ==0&& b%2 ==0){
      newA = (b/2)+(c/2);
      newC = (b/2)+(a/2);
      newB = (a/2)+(c/2);
      a=newA;
      b=newB;
      c=newC;
      if(a == d && b == e && c == f){
        steps = -1;
        break;
      }
      steps++;
    }
    System.out.println(steps);
  }
}