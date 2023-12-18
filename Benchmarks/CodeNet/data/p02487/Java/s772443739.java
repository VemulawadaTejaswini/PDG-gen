import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n, m;
	
	while(true){
	    n = s.nextInt();
	    m = s.nextInt();
	    if(n == 0 && m == 0) break;

	    for(int i = 0 ; i < n ; i++){
		for(int j = 0 ; j < m ; j++){
		    if(i == 0 || j == 0 || i == n-1 || j == m-1) System.out.printf("#");
		    else System.out.printf(".");
		}
		System.out.println();
	    }
	    System.out.println();
	}
    }
}