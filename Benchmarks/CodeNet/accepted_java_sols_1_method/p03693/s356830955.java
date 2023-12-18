import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int sum = x*100 + y*10 + z;
    if(sum % 4 == 0) System.out.println("YES");
    else System.out.println("NO");
 
  }
}