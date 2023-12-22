import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    
    for(int i=0;i<N;i++){
       int s=sc.nextInt();
      if(s%2==0){
        if(s%3==0||s%5==0){
          ;
        }else{
          System.out.print("DENIED");
          break;
        }
      }
      if(i==N-1){
        System.out.print("APPROVED");
      }
    }
  }

}
