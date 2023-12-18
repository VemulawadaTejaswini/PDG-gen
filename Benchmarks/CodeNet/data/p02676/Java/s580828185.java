import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int K=sc.nextInt();
      String S=sc.next();
      if(K<S.length()){
         for(int i=0;i<K;i++){
            System.out.print(S.charAt(i));
         }
         System.out.println("...");
      }else{
         System.out.println(S);
      }
   }
}
