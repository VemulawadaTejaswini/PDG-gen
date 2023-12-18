import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    long A=scan.nextInt();
    long B=scan.nextInt();
    long K=scan.nextInt();
    for(int i=0;i<K;i++){
      if(i%2==0){
        if(A%2!=0){
          A--;
        }
          B+=A/2;
          A/=2;
      }
      else{
        if(B%2!=0){
          B--;
        }
          A+=B/2;
          B/=2;
      }
    }
    System.out.println(A+" "+B);
  }
}