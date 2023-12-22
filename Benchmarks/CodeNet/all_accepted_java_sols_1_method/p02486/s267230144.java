import java.util.Scanner;
import java.util.ArrayList;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  ArrayList<Integer> combi =new ArrayList<Integer>();
  int n=-1,x=-1;
  int m=0;
  do{
   int count=0;
   n=sc.nextInt();
   x=sc.nextInt();
   for(int i=1;i<=n-2;i++){
    for(int j=i+1;j<=n-1;j++){
     for(int k=j+1;k<=n;k++){
      if(i+j+k==x)
       count++;
     }
    }
   }
    combi.add(m,count);
    m++;
  }while(n!=0||x!=0);
  for(int l=0;l<m-1;l++){
   System.out.println(combi.get(l));
  }
}
}