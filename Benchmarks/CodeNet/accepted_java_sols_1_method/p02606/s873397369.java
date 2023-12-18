import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int l=sc.nextInt(),r=sc.nextInt(),d=sc.nextInt(),f=0;
    for(int i=l;i<=r;i++){
      if(i%d==0){
        f++;
      }
    }
    System.out.println(f);
  }
}
