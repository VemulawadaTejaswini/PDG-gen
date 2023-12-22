import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int q = sc.nextInt();

	while(n!=0 && q!=0){

	    int[] allDate = new int[100];

	    for(int i=0; i<n; i++){
		int dateNum = sc.nextInt();
		for(int j=0; j<dateNum; j++){
		    int date = sc.nextInt();
		    allDate[date]++;
		}
	    }

	    int max = 0;
	    int ans = 0;
	    for(int i=0; i<100; i++){
		if(allDate[i]>max && allDate[i]>=q){max = allDate[i]; ans = i;}
	    }

	    System.out.println(ans);

	    n = sc.nextInt();
	    q = sc.nextInt();
	}
    }
}