import java.util.Scanner;

class Main {

    static int calc(int sum){
	return Math.min(sum, 18 - sum) + 1;
    }

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	int sum = stdin.nextInt();
	int ab = 0;
	int cd = 0;
	int ans = 0;
	for(ab = 0; ab <= 18 && ab + cd <= sum; ab++){
	    for(cd = 0; cd <= 18 && ab + cd <= sum; cd++){
		if(ab + cd == sum){
		    ans += calc(ab) * calc(cd);
		}
	    }
	    cd = 0;
	}
	System.out.println(ans);
    }
}