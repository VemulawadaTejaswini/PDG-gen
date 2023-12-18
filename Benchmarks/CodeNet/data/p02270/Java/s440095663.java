import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

    private static int[] w;

    public static void main(String[] args){

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	try{
	    String input = br.readLine();
	    String[] n_k = input.split(" ", 0);
	    int n = Integer.parseInt(n_k[0]);
	    int k = Integer.parseInt(n_k[1]);
	    w = new int[n];
	    for(int i=0;i<n;i++){
		w[i] = Integer.parseInt(br.readLine());
		//System.out.println(w[i]);
	    }
	    	    
	    //System.out.println(k);
	    Allocation(n,k);
	 

	}catch(Exception e){

	}	
	
    }
    public static int Check(int P, int n, int k){
	int c = 0;
	for(int i=0;i<k;i++){
	    int sum = 0;
	    while(sum+w[c]<=P){
		sum += w[c];
		c++;
		if(c==n) return n;
	    }
	}
	return c;
    }
    
    public static void Allocation(int n, int k){
	int left = 0;
	int right = 100000 * 10000;
	int m;

	while(right -left>1){
	    m = (left + right)/2;
	    int c = Check(m,n,k);
	    if(c >= n){
		right = m;
	    }else{
		left = m;
	    }
	}

	System.out.println(right);

    }
}


