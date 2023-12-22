import java.util.*;
public class Main {

 public static void main(String[] args) {
   Scanner no=new Scanner(System.in);
   int n=no.nextInt();
   StringBuilder sb=new StringBuilder();
   String arr[]=new String[n];
   int m=no.nextInt();
   for(int i=0;i<n;i++){
     arr[i]=no.next();
   }
   Arrays.sort(arr);
   for(int i=0;i<n;i++){
     sb.append(arr[i]);
   }
   System.out.println(sb.toString());
  }

}
 