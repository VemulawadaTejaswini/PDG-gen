import java.util.Scanner;

class Main{
    public static void main(String[] args){
	int i;
	int j;
	int key;
	int count = 0;
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int S[] = new int[n];
	for(i=0 ; i<n ; i++){S[i] = scan.nextInt();}

	int q = scan.nextInt();
	int T[] = new int[q];
	for(j=0 ; j<q ; j++){T[j] = scan.nextInt();}

	int l;
	int r;
	int m;
	for(j=0 ; j<q ; j++){
	    key = T[j];
	    l = 0;
	    r = n;
	    m = (l+r)/2;
	    
	    while(true){
		if(key > S[n-1]){break;}
		
		if(key == S[m]){
		    count++;
		    break;
		}
		else if(key!=S[m] && l==m){break;}
		
		else if(key < S[m]){
		    r = m;
		    m = (l+r)/2;
		}
		else if(key > S[m]){
		    l = m+1;
		    m = (l+r)/2;
		}
	    }
	}

	System.out.println(count);

    }
}

