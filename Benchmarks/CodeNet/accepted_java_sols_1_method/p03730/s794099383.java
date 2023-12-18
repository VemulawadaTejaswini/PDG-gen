import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    sc.close();
    boolean isOK=false;
    for(int i=0;i<a;i++){
      if((b*i+c)%a==0){
        isOK=true;
        break;
      }
    }
    if(isOK){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}