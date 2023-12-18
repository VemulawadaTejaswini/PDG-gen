import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int k=sc.nextInt();
  int n=7;
  n%=k;
  int i;
  for(i=0;i<k+1;i++){
    if(n==0){
    break;
    }
  	n*=10;
    n+=7;
    n%=k;
  }
  if(i==k+1){System.out.println(-1);}
  else{
    System.out.print(i+1);
  }
}
}