import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int ans=Integer.MAX_VALUE;;
  if(360%x==0){
ans=360/x;
  }else{
    int c=360%x;
ans=((360-c)/c)+1;
  }
  System.out.println(ans);
}
}