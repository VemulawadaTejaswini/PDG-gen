import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int count=0;
    int n=0;
    for(int i=1;i<4;i++){
      if(s.charAt(0)==s.charAt(i)){
        count=count+1;
        n=i;
      }
    }
    if(n==1){
      if(s.charAt(2)==s.charAt(3)){
        count=count+1;
      }
    }
    if(n==2){
      if(s.charAt(1)==s.charAt(3)){
        count=count+1;
      }
    }
    if(n==3){
      if(s.charAt(1)==s.charAt(2)){
        count=count+1;
      }
    }
    if(count==2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
