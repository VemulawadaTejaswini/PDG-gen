import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	
	int ans = 0;
	for(int i = 1; i <= n; i += 2){
	    int count = 0;
	    for(int j = i; j >= 1; j--){
		if(i % j == 0){
		    count++;
		}
	    }
	    if(count == 8){
		ans++;
	    }
	}
	
	System.out.println(ans);
    }
}
