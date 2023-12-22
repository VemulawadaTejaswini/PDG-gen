import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String q ="";
    if(a==b){
      q="Draw";
    }else if(a==1){
      q="Alice";
    }else if(b==1){
      q="Bob";
    }else if(a>b){
      q="Alice";
    }else{
      q="Bob";
    }
    System.out.println(q);

  }
  

  
}
