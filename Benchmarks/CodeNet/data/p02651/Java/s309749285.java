import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;


public class Main{
 public static void main(String[] args) {
   Scanner kbd =new Scanner(System.in);
   int t=kbd.nextInt();

   for(int k=0;k<t;k++){
   int n=kbd.nextInt();
   int[] A= new int[400];
   for(int i=0;i<n;i++){
     A[i]=kbd.nextInt();
   }
   String S=kbd.next();

   Set<Character> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
    set.add(S.charAt(A[i]));}

    if(set.size()==n){
  System.out.println("1");
}else{
  System.out.println("0");
}

 }
}
}