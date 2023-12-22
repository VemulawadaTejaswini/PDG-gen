import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int N = 0;
    if(b<10){
      N=10*a+b;
    }else if(10<=b&&b<100){
      N=100*a+b;
    }else{
      N=1000*a+b;
    }
  //  System.out.println(N);
    System.out.println(isSq(N));
    
  }
  
  //引数が平方数なら"Yes",違うなら"No"を返すメソッド
  public static String isSq(int N){
   String res = "No";
    for(int i=1;i<=(int)Math.ceil(Math.sqrt(N));i++){
             // System.out.println(i);
      if(i*i==N){
        //System.out.println(i);
        res="Yes";
        return res;
      }
    }
    return res;
        
    
  }
    
  

  
}