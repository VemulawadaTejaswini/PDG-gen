import java.util.*;

public class Main{
  public static void main(String[] args){
    int xi[]= new xi[5];
    Scanner sc =new Scanner(System.in);
    for(int i=0;i<5;i++){
      xi[i]=sc.nextint();
    }
    for(int i=0;i<5;i++){
      if(xi[i]==0){
        System.out.println(i+1);
        break;
      }
    }
  }
}
      