import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int A = sc.nextInt();
	int B = sc.nextInt();
	int C = sc.nextInt();
	int coin = 0;
	int count = 0;

	while(coin < C){ 
	    count++;
	    coin += A;
	    if(count%7==0){
		coin += B;
	    }
	}

	System.out.println(count);
    }
}

