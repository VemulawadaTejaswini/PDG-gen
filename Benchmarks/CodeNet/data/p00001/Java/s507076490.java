import java.util.*;
public class Main{
 public static void main(String args[]){
  Scanner n=new Scanner(System.in);
  int i[]=new int[10];
  for(int j=0;j<=9;j++){
   i[j]=n.nextInt();
  }
  Arrays.sort(i);
  System.out.println(i[9]);
  System.out.println(i[8]);
  System.out.println(i[7]);
 }
}