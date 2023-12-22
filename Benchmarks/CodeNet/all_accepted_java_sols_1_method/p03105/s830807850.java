import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
      	int _max = b / a;
      	int max = _max;
      	if(max > c){
        	max = c; 
        }
		// 出力
		System.out.println(max);
	}
}