import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

      int N=sc.nextInt();
      boolean truth=false;
      if((N%1000>=700&&N%1000<=799)||(N%100>=70&&N%100<=79)||(N%10==7)){
         truth=true;
      }
      if(truth){
         System.out.println("Yes");
      }else{
         System.out.println("No");
      }
   }
}
