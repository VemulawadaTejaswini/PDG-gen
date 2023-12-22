import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int m = scan.nextInt();
	int x = scan.nextInt();
	int[] a = new int[m];
	int[] cost = new int[n+1];
	for(int i = 0; i < m; i++){
	    a[i] = scan.nextInt();
	    cost[a[i]]++;
	}

	int[] ruiseki = new int[n+1];
	for(int i = 1; i < n+1; i++){
	    ruiseki[i] = ruiseki[i-1]+cost[i];
	}

	if(ruiseki[x-1] >= (ruiseki[n]-ruiseki[x])){
	    System.out.println(ruiseki[n]-ruiseki[x]);
	}else{
	    System.out.println(ruiseki[x-1]);
	}
    }
}
			       
