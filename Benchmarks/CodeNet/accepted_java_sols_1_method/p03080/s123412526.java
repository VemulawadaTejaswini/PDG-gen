import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   String s = sc.next();
   int cntR=0,cntB=0;
   for(int i=0; i<n; ++i) {
     if(s.charAt(i) == 'R') ++cntR;
     else ++cntB;
   }
   if(cntR > cntB)
     System.out.println("Yes");
   else
     System.out.println("No");
 }
}