import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),k=sc.nextInt(),min=1;
    for(int i=1;i<=n;i++){
      min=(int)Math.min(2*min,min+k);
    }
    System.out.print(min);
  }
}
