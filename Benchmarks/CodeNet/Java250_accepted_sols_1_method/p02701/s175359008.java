
import java.util.*;
public class Main{
 public static void main(String[] args) {
   Scanner kbd = new Scanner(System.in);
   int n=kbd.nextInt();
   String[] A= new String[n];
   for(int i=0;i<n;i++){
     A[i]=kbd.next();
}
int x=1;
Arrays.sort(A);
for(int i=0;i<n-1;i++){
if(!(A[i].equals(A[i+1]))){
  x=x+1;
}
}
System.out.println(x);
}
}
