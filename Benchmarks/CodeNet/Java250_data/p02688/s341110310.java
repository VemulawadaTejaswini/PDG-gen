import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int n=sc.nextInt(),k=sc.nextInt();
  int po[]=new int[n];
  for(int i=0;i<k;i++){
      int d=sc.nextInt();
      for(int j=0;j<d;j++){
          po[sc.nextInt()-1]++;
      }
  }
  int sum=0;
  for(int i=0;i<n;i++){
    if(po[i]==0)sum++;
  }
  System.out.println(sum);
}
}