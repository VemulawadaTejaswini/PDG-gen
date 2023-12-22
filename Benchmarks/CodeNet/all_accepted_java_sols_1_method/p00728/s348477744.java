import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();

	while(n!=0){
	    int sum = 0;
	    int max = 0;
	    int min = 1000;
	    for(int i=0; i<n; i++){
		int score = sc.nextInt();
		sum += score;
		if(score>max){max = score;}
		if(score<min){min = score;}
	    }

	    int ans = (sum-max-min)/(n-2);
	    System.out.println(ans);

	    n = sc.nextInt();
	}
    }
}