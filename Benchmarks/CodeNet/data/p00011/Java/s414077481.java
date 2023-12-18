import java.util.Scanner;

public class Main{
 public static void main(String[] args){
 Scanner sc=new.Scanner(System.in);
  int w=0,n=0;
  int data[30];
  n=sc.nextInt();
  w=sc.nextInt();
  for(int i=0;i<n;i++){
   data[i]=i+1;
  }
  for(int j=0;j<w;j++){
   int a=sc.nextInt();
   int b=sc.nextInt();
   tmp=data[a-1];
   data[a-1]=data[b-1];
   data[b-1]=tmp;
  }
  for(int k=0;k<n;k++){
   System.out.println(data[k]);
  }
  }
  }