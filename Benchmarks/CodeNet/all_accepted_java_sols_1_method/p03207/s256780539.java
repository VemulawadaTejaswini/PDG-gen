import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int max=0;
    for(int i=0;i<n;i++){
      int p=sc.nextInt();
      if(p>max){
        max=p;
      }
      sum+=p;
    }
    System.out.println(sum-max/2);
  }
}