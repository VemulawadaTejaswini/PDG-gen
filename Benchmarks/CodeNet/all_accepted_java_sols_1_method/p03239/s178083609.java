import java.util.*;
class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N =	sc.nextInt();
	int T =	sc.nextInt();
	int[] cost = new int[N];
	int[] time = new int[N];
	for(int i = 0; i< N; i++) {
            cost[i] = sc.nextInt();
	    time[i] = sc.nextInt();
            if(time[i] > T) cost[i] = 1001;
	}
	int min	= 1001;
	for(int i = 0; i< N; i++) {
            if(cost[i] < min) min = cost[i];
	}
	if(min == 1001)	{
            System.out.println("TLE");
        }else {
            System.out.println(min);
	}

    }
}