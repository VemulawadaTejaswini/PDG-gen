import java.util.*;
class Main{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[]a=new int[n];
  for(int i=0;i<n;i++)a[i]=sc.nextInt();
  if(n<3){
  System.out.println(0);
  }else{int count=0;
  for(int i=0;i<n;i++){
  for(int j=0;j<n;j++){
  for(int k=0;k<n;k++){
  if(a[i]+a[j]<a[k]||a[k]+a[j]<a[i]||a[i]+a[k]<a[j]){}else count++;
  }
  }
  }System.out.println(count-n);
  
  }
}
}
