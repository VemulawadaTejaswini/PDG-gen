import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();

      String S = sc.next();
      char[] data = new char[n];

      int count =0;

      if(n%2!=0){
        System.out.println("No");
        System.exit(0);
      }

      for(int i = 0;i<n;i++){
         data[i] = S.charAt(i);
      }
      for(int i =0;i<n/2;i++){
         if(data[i]==data[(n/2)+i]){
           count++;
         }
       }
         if(count==n/2){
           System.out.println("Yes");
         }else{
           System.out.println("No");
         }



}
}
