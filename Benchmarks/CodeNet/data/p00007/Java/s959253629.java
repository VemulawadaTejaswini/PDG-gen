import java.util.Scanner;

class Main {

    public static void main(String[] args){
	Scanner stdin = new Scanner(System.in);
	double money = 100000;
	int n = stdin.nextInt();
	for(int i = 0; i < n; i++){
	    money *= 1.05;
	}
	double r = money % 10000;
	int ans = (int)(money / 10000);
	if(r >= 5000){
	    ans++;
	}
	ans *= 10000;	    
	System.out.println(ans);
    }
}