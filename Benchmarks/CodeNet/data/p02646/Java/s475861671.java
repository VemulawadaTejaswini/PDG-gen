import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 int a=sc.nextInt();
  int v=sc.nextInt();
  int b=sc.nextInt();
  int w=sc.nextInt();
  int t=sc.nextInt();
  int dis=Math.abs(a-b);
  int ve=v-w;
  if(ve<=0)System.out.println("NO");
  else{
  	if(dis%ve==0){
      	if(dis/ve<=t){System.out.println("YES");}else{System.out.println("NO");}
    }else{System.out.println("NO");
    }
  }
}
}