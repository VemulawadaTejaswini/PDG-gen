import java.util.*;
class Main{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  int N  = scan.nextInt();
      int A = 0;
      long count = 0;
      int max = 0;
      for(int i = 0; i < N; i++){
          A = scan.nextInt();
          if(i == 0)    max = A;
          else{
             if(max <= A) max = A;
          	 count += max - A;
          }
      }
      System.out.println(count);
	}
}