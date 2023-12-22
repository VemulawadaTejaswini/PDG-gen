import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    a=sc.nextInt();
    b=sc.nextInt();
    int n=0;
    if(a<b){
      for(int i=0;i<b;i++){
        if(i-a==b-i){
          n=i;
          break;
        }
      }
    }else{
      for(int i=0;i<a;i++){
        if(a-i==i-b){
          n=i;
          break;
        }
      }
    }
    if(n!=0){
      System.out.println(n);
    }else{
      System.out.println("IMPOSSIBLE");
    }
  }
}
