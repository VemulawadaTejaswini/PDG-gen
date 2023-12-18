import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    long res = 1;
    for(int i = 0; i < n; i++){
      res *= sc.nextLong(); 
      if(res / 10000000000000000L > 1){
        res = -1;
        i += n;
      }
    }
    System.out.println(res);  		
  }
}