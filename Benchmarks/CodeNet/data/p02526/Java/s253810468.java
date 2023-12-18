import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n, m, cnt = 0;
	n = sc.nextInt();
	int[] S = new int[n];
	for(int i = 0 ; i < n ; i++){
	    S[i] = sc.nextInt();
	}
	m = sc.nextInt();
	int[] T = new int[m];
	for(int i = 0 ; i < m ; i++){
	    T[i] = sc.nextInt();
	    for(int j = 0 ; j < n ; j++){
		if(T[i] == S[j]){
		    cnt++;
		    break;
		}
	    }
	}
	System.out.println(cnt);
    }
}