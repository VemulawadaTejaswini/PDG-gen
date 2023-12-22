import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      int A = sc.nextInt();
      int B = sc.nextInt();
      int C = 0;
      for(int i=A;i<B+1;i++){
        if(i%K==0){
          C=C+1;
          break;
        }else{
          continue;
        }
      }if(C>0){
        System.out.println("OK");
      }else{
        System.out.println("NG");
      }
    }
}