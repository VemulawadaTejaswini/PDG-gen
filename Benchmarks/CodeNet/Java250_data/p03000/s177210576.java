import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int x = sc.nextInt();
	int[] l = new int[n+1];

	for(int i = 0; i < n; i++) {
	    l[i] = sc.nextInt();
	}

	int d1 = 0;
	int di = d1;
	
	
	for(int i = 1; i <= n+1; i++) {
	    if(di > x) {
		System.out.println(i-1);
		break;
	    }
	    if(i == n+1){
		System.out.println(i);
		break;
	    }
	    di += l[i-1];
	    
	}
	


    }
}