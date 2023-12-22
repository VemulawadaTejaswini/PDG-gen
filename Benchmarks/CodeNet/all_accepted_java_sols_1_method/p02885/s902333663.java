import java.util.*;
public class Main{
public static void main(String[] args){
  Scanner obj=new Scanner(System.in);
  int h_l=obj.nextInt();
  int w=obj.nextInt();
  int c=2*w;
  int u=h_l-c;
  if(u>0){
  System.out.println(u);
  }else{
  System.out.println(0);
  }
}

}
