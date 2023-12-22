import java.util.*;
class Main{
  public static void main(String args[]){
    int kigen,n;   
    Scanner sc = new Scanner(System.in);
    kigen=sc.nextInt();
    n=sc.nextInt();
    for(int i=0;i<n;i++){
      kigen-=sc.nextInt();
    }
    if(kigen<-1)kigen=-1;
    System.out.println(kigen);
  }
}