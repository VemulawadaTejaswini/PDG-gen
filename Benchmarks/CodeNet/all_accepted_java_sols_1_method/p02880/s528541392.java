import java.util.*;

public class Main { 
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      String o="No";
      for(int i=1;i<10;i++){
      	if(n%i==0 && n/i<10){
        	o="Yes";
        }
      }
      
      System.out.println(o);
    }
}