import java.util.*;

class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int t = sc.nextInt();
	int a = sc.nextInt();

        int[] h = new int[n];
	for(int i = 0;i < n;i++){
	    h[i] = sc.nextInt();
	}

	double min = Math.abs(t - h[0]*0.006 - a);
	int id = 0;

	for(int i = 1;i < n;i++){
	    double dif = Math.abs(t - h[i]*0.006 - a);
	    if(min > dif){
		min = dif;
		id = i;
	    }
	}

	System.out.println(id+1);
    }
}
