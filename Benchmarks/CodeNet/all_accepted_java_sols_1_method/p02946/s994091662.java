import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    int a = x-(k-1);
    for(int i = 0;i<k*2-1;i++){
      if(a<-1000000||a>1000000)continue;
        System.out.print(a+" ");
        a++;
    }    
  } 
}