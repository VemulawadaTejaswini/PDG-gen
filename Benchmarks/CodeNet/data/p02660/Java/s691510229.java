import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long N = sc.nextLong();
    if(N==1){
      System.out.println(0);
      return;
    }
    int sum = 0;
    Long N2 = N;
    for(Long i=2L; i<100000L; i++){
      if(N%i==0){
        sum++;
        N = N/i;
      }
    }
    if(sum==0){
      System.out.println(1);
    }else{
      System.out.println(sum);
    }
  }

}  
  



