import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int n = scan.nextInt();
	int k = scan.nextInt();

	int ans = 1;
	for(int i = 0; i < n; i++){
	    if(ans < k){
		ans *= 2;
	    }else{
		ans += k;
	    }
	}

	System.out.println(ans);
    }
}

		  
