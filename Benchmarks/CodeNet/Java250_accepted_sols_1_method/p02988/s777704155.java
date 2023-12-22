import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
	    int[] number = new int[N];
	    int count = 0;

	    for(int i=0; i<N; i++){
	      number[i] = sc.nextInt();
	    }
	    for(int i=1; i<N-1; i++){
	      if((number[i-1]<=number[i])&&(number[i]<=number[i+1])){
	        count++;
	      }else if((number[i+1]<=number[i])&&(number[i]<=number[i-1])){
	        count++;
	      }
	    }
	    System.out.println(count);
	}

}