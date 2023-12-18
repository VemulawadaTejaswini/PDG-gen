import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S =sc.next();
      
      char[] a =S.toCharArray();
      
     for(int i=0; i<S.length(); i++){
     if(i%2==0){
     if(a[i]=='L'){
     System.out.println("No");
       return;
     }
     }
       if(i%2!=0){
       if(a[i]=='R'){
       System.out.println("No");
         return;
       }
       }
     }
      System.out.println("Yes");
    }
}