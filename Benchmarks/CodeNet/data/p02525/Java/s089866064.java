import java.util.Scanner;
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] b = new int[1000];
	int i = 0;
	int sum = 0;
	int ave;
	int a = 0;
	int n = sc.nextInt();
	if(n == 0){
	    break;
	}
	for(i=0; i<n; i++){
	    b[i] = sc.nextInt();
	    sum += b[i];
	}
	ave = sum/n;
	for(i=0; i<n; i++){
	    a += (b[i]-ave)*(b[i]-ave);
	}
	double ans = Math.sqrt(a/n);
	System.out.println(ans);
    }
}