import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int k = sc.nextInt();

      if(b-a<=k && c-a<=k && d-a<=k && e-a<=k && c-b<=k && d-b<=k && e-b<=k && d-c<=k && e-c<=k && e-d<=k){
 	System.out.println("Yay!");
      }else{
	System.out.println(":(");        
      }
      }
}