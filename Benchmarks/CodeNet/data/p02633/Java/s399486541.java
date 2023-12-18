import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int ans=0;
if(360%x==0){
ans=360/x;
}else{
ans=Math.ceil(360/(180-x));
}
  System.out.println(ans);
}
}