import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int N=sc.nextInt();
  int flag=0;
  for(int i=0;i<N;i++){
    int a=sc.nextInt();
    if(a%2==1){
      continue;
    }
    else{
      if((a%3==0) || (a%5==0)){
        continue;
      }
      else{
        flag=1;
        break;
      }
    }
  }
  if(flag==1){
    System.out.println("DENIED");
  }
  else{
    System.out.println("APPROVED");
  }     
}
}