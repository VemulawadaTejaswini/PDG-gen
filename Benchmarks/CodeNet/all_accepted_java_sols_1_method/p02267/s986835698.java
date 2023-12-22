import java.util.Scanner;

class Main{
    public static void main(String[] args){
	int i;
	int j;
	int k;
	int count=0;
	Scanner scan = new Scanner(System.in);

	int snum = scan.nextInt();
	int S[] = new int[snum];
	for(i=0 ; i<snum ; i++){
	    S[i] = scan.nextInt();
	}

	int tnum = scan.nextInt();
	int T[] = new int[tnum];
	for(j=0 ; j<tnum ; j++){
	    T[j] = scan.nextInt();
	}
	
	for(j=0 ; j<tnum ; j++){
	    for(i=0 ; i<snum ; i++){
		for(k=i-1 ; k>0 ; k--){
		    if(S[i] == S[k]){
			i++;
			break;
		    }
		}
		if(T[j] == S[i]){
		    count++;
		    break;
		}
	    }
	}
	System.out.println(count);
    } 
}


