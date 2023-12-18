import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){

	    int[] num = new int[n];
	    for(int i=0; i<n; i++){
		num[i] = sc.nextInt();
	    }

	    int max = 0;
	    int sum = 0;
	    for(int i=0; i<n; i++){
		if(num[i]>0){
		    for(int j=0; j<=i; j++){
			sum+=num[j];
		    }
		    if(sum>max){max = sum;}
		    for(int j=1; j<=i; j++){
			sum = sum-num[j-1];
			if(sum>max){max = sum;}
		    }
		    sum = 0;
		}
	    }

	    System.out.println(max);

	    n = sc.nextInt();
	}
    }
}