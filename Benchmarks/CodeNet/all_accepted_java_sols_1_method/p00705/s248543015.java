import java.util.*;

class Main{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int t;
	int[] max = new int[2]; 
	int[] a = new int[102];

	while(true){
	int n = sc.nextInt();
	int q = sc.nextInt();

	if( (n|q) == 0 ) break;
	

	Arrays.fill(a,0);
	max[0] = 0;

	for(int l=0; l<n ;l++){
	    int m = sc.nextInt();
	    for(int k=0; k<m ; k++){
		t=sc.nextInt();
		a[t]++;
		if(max[0] < a[t]){
			max[0]=a[t];
			max[1]=t;
		}else if(max[0]==a[t]){
		    if(max[1]>t){
			max[0]=a[t];
			max[1]=t;
		    }
		}
	    }
	
	}
	if(max[0]>=q) System.out.println( max[1] );
	else System.out.println( "0" );
    }
}   
}