  import java.util.*;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   String alpha="abcdefghijklmnopqrstuvwxyz";
   String target=sc.next();
   
   for(int i=0;i<=24;i++){
     if(String.valueOf(alpha.charAt(i)).equals(target)){
        System.out.println(alpha.charAt(i+1));
     }
   }
 }
}
