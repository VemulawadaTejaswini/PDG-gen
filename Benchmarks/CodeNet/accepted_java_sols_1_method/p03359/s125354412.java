import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
      	int B = sc.nextInt();
      	if(A<=B){
        	System.out.println(A);
        }else{
        	System.out.println(A-1);      
        }
      
      	
    }
}