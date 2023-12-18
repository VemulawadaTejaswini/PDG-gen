import java.util.*;

public class Main{
    final int mx = 50001;
    Vector<Integer> vec;

    void mkPrm(){
	vec = new Vector<Integer>();
	boolean[] prm = new boolean[mx];
	for(int i = 0; i < mx; i++) prm[i] = true;
	prm[0] = prm[1] = false;
	
	for(int i = 2; i < mx; i++)
	    if(prm[i]){
		vec.add(new Integer(i));
		for(int j = i+i; j < mx; j+=i) 
		    prm[j] = false;
	    }

	return ;
    }

    Main(){
	Scanner sc = new Scanner(System.in);
	mkPrm();
	int l = vec.size();

	while(sc.hasNext()){
	    int n = sc.nextInt(), cnt = 0;
	    if(n == 0) break;

	    for(int i = 0; (vec.get(i)).intValue() < n; i++)
		for(int j = i, v = (vec.get(i)).intValue(); v+(vec.get(j)).intValue() <= n; j++)
		    if(v+(vec.get(j)).intValue() == n) cnt++;

	    System.out.println(Integer.toString(cnt));
	}
    }

    public static void main(String[] args){
	new Main();
    }
}