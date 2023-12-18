import java.util.*;

public class Main{
    boolean[] prm;
    final int mx = 50001;

    void mkPrm(){
	prm = new boolean[mx];
	for(int i = 0; i < mx; i++) prm[i] = true;
	prm[0] = prm[1] = false;
	
	for(int i = 2; i < mx; i++)
	    if(prm[i])
		for(int j = i+i; j < mx; j+=i) 
		    prm[j] = false;

	return ;
    }

    Main(){
	Scanner sc = new Scanner(System.in);
	mkPrm();

	while(sc.hasNext()){
	    int n = sc.nextInt(), cnt = 0;
	    if(n == 0) break;

	    for(int i = 2; i <= (n+1)/2; i++)
		if(prm[i] && prm[n-i]) cnt++;

	    System.out.println(Integer.toString(cnt));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}