import java.util.Scanner;


public class Main {

	Scanner sc;
	
	int solve(int n){
		if(n==1) return 0; else return 1+(n%2==0 ? solve(n/2) : solve(n*3+1));
	}
	
	int ni(){
		return sc.nextInt();
	}
	
	void io(){
		sc=new Scanner(System.in);
		while(true){
			int n=ni();
			if(n==0) break;
			System.out.println(solve(n));
		}
		sc.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().io();
	}

}