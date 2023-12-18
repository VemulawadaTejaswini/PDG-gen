import java.util.*;
class Main{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  for(int i=1000;;i+=1000){
    if(i>=n){
System.out.println(i-n);
      break;
    }
  }
}
}