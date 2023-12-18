import java.util.*;
class Main{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  int N  = scan.nextInt();
      int A = 0;
      int count = 0;
      int flont = 0;
      for(int i = 0; i < N; i++){
          A = scan.nextInt();
          if(i == 0)    flont = A;
          else{
            if(flont > A){
               count += flont - A;
            }else{
                flont = A;
            }
          }
      }
      System.out.println(count);
	}
}