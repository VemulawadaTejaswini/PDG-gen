import java.util.*;
public class Main{
  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int d=sc.nextInt();
  int as=sc.nextInt();
  int ar[]=new int[10000];
  int s=0;
  
  for(int i=0;i<as;i++){
  ar[i]=sc.nextInt();
  
  }
  for(int i=0;i<ar.length;i++){
  s=s+ar[i];
  }
  int f=d-s;
  if(f>=0){

  System.out.println(f);
  }
  else{System.out.println("-1");}
  }
}