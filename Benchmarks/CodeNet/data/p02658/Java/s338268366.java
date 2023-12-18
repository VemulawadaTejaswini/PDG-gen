import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    Long sum = 1L;
    Long max = 0L;
    Long b = 1000000000000000000L;
    for(int i = 0; i<N ;i++){
      long tmp = sc.nextLong();
      if(tmp==0){
        System.out.println(0);
        return;
      }
      sum = sum * tmp;
      if(sum>=max && sum<=b){
        max = sum;
      }else{
        System.out.println(-1);
        return;
      }
    }  
    System.out.println(sum);
  }
}
