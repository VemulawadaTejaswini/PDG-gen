import java.util.*;

public class Main{
 public static void main(String args[]){
  Scanner scn = new Scanner(System.in);
  int N = scn.nextInt();
  String s = scn.next();
  int R =0;
  int B =0;

for(int i=0;i<N;i++){
if(s.charAt(i)=='R'){
R++;
}else{
B++;
}
}
if(R-B>0){
System.out.print("Yes");
}else{
System.out.print("No");
}

    }
}
