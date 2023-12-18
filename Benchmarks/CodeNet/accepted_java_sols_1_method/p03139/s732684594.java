import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
      	int A = sc.nextInt();
      int B = sc.nextInt();
      int max = 0;
      int min = 0;
   		if(A>B){
          max = B;
        }else{
          max = A;
        }
       if(A+B-N>=0){
       	min = A+B-N;
       }
       	System.out.println(max+" "+min);
    }
}