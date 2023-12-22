import java.util.*;
public class Main {
    public static void main(String[] args) {	
	Main main = new Main();
    	main.solveB();
    }
    
    private void solveA() {
	Scanner sc = new Scanner(System.in);
    	int A = sc.nextInt();
    	int B = sc.nextInt();
	String s;
	if (A>=9 || B>=9){
	    s = ":(";
	}
	else{
	    s = "Yay!";
	}
    	System.out.println(s);
    }

    private void solveB() {
	Scanner sc = new Scanner(System.in);
	int D = sc.nextInt();
    	int N = sc.nextInt();
	int p = 1;

	for (int i=0;i < D;i++){
	    p *=100;
	}

	if (N==100) N = 101;
	
	System.out.println(p*N);
    }
}