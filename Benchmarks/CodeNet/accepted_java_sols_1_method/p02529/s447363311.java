import java.util.*;

public class Main{
    public static void main(String args[]){
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	int S[] = new int[a];

	for(int i = 0 ; i < a ; i++)
	    S[i] = in.nextInt();


	int b = in.nextInt();
	int T[] = new int[b];
	for(int i = 0 ; i < b ; i++)
	    T[i] = in.nextInt();

	Arrays.sort(S);	
	Arrays.sort(T);	
	int S_pos = 0, T_pos = 0,cnt = 0;

	while(true){
	    if(S_pos == a || T_pos == b) break;
	    if(S[S_pos] > T[T_pos]){
		T_pos++;
	    }
	    else if(S[S_pos] < T[T_pos]){
		S_pos++;
	    }
	    else{
		cnt++;
		S_pos++;
		T_pos++;
	    }
	}

	System.out.println(cnt);
    }
}