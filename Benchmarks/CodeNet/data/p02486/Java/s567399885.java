import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n, x;
	while(true){
	    int cnt = 0;
	    n = s.nextInt();
	    x = s.nextInt();
	    if(n == 0 && x == 0) break;

	    for(int i = 1 ; i < n; i++){
		for(int j = i+1 ; j < n ; j++){
		    for(int k = i+2 ; k < n ; k++){
			if(i + j + k == x) cnt++;
		    }
		}
	    }
	    System.out.println(cnt);
	}
    }
}