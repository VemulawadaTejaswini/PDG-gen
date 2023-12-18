import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	while(true){
	    int n = sc.nextInt();
	    int x = sc.nextInt();
	    int count=0;
	    if(n == 0 && x == 0) break;
	    for(int i=1;i<=n;i++){
		for(int j=i+1;j<=x;j++) if((x-i-j) <= n && (x-i-j) > j) count++;
	    }
	    System.out.println(count);
	}
    }
}