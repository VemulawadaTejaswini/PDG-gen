import java.util.*;

public class Main {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	while(scan.hasNext()) {
	    int n = scan.nextInt();
	    if(n == 0) break;
	    int mini, maxi;
	    mini = 501;
	    maxi = -1;
	    for(int i = 0; i < n; ++i) {
		int sum = 0;
		for(int j = 0; j < 5; ++j) {
		    sum += scan.nextInt();
		}
		if(sum > maxi) maxi = sum;
		if(sum < mini) mini = sum;
	    }
	    System.out.println(maxi+" "+mini);
	}
    }
}