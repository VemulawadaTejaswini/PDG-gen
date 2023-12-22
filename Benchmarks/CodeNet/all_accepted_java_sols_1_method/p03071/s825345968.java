import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B=  sc.nextInt();
    int coin=0;
    
    for(int i=0;i<2;i++){
     if(A>B){
      coin+=A;
       A-=1;
     }else{
        coin+=B;
       B-=1;
    }
  }System.out.println(coin);
}
}

