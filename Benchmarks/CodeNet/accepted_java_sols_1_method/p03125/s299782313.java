import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int i=0;
    int num=0;
    while(true){
    	num=A+A*i;
          i++;
      	if(num==B){
        System.out.println(A+B);
          break;
        }else if(num>B){
          System.out.println(B-A);
          break;
        }
    }
  }
}