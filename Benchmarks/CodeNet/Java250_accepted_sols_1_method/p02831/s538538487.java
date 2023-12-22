import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();  
    long x = a * b;
    long  r = 0;
    
  if(a<b){
    long tmp = a;
    a = b;
    b = tmp;
  }
 
  /* ユークリッドの互除法 */
  r = a % b;
  while(r!=0){
    a = b;
    b = r;
    r = a % b;
  }
    
    System.out.println(x/b);
    
  }
}
