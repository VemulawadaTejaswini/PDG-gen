import java.util.*;

public class Main{
    final int mx = 50001;
    boolean[] prm;

    void mkPrm(){
	prm = new boolean[mx];
	for(int i = 2; i < mx; i++)
	    prm[i] = true;
	prm[0] = prm[1] = false;

	for(int i = 2; i < mx; i++)
	    if(prm[i])
		for(int j = i+i; j < mx; j += i)
		    prm[j] = false;

	return ;
    }

    Main(){
	Scanner sc = new Scanner(System.in);
	mkPrm();

	while(sc.hasNext()){
	    int n = sc.nextInt(), cnt = 0;
	    if(n == 0) break;
	    if(n%2 == 1){
		System.out.println("0");
		continue;
	    }

	    for(int i = 3, j = n; i < j; i+=2)
		if(prm[i] && prm[n-i]){
		    cnt++;
		    j = n-i;
		}

	    System.out.println(Integer.toString(cnt));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}