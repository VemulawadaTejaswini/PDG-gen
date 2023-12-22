import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int m = sc.nextInt();
      	int a;
      	for(int i = 0; i < m; i++){
        	a = sc.nextInt();
          	n -= a;
        }
      	if(n < 0) System.out.println(-1);
      	else System.out.println(n);
    }
}