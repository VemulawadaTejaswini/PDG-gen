import java.util.*;
public class Main{
 public static void main(String args[]){
  Scanner x=new Scanner(System.in);
  int n[][]=new int[200][2];
  int i=0;
  for(i=0;i<=199;i++){
   n[i][0]=x.nextInt();
   n[i][1]=x.nextInt();
  }
  for(i=0;i<=199;i++){
   System.out.println(String.valueOf(n[i][0]*n[i][1]).length());
  }
 }
}