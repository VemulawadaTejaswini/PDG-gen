import java.util.Scanner;

class Main{

    public static void main(String[] args){

	Scanner scan = new Scanner(System.in);

	while(true){

	    int n = scan.nextInt();

	    if(n == 0){
		break;
	    }

	    int[] prime = new int[n+1];

	    for(int i = 0; i < n; i++){
		prime[i] = 1;
	    }

	    prime[0] = 0;
	    prime[1] = 0;

	    for(int i = 2; i < Math.sqrt(n+1); i++){
		if(prime[i] == 1){

		    for(int j = i * 2; j < n + 1; j+=i){
			prime[j] = 0;
		    }

		}
	    }


	    int pass = 0;

	    for(int i = 2; i <= n / 2; i++){

		if(prime[i] == 1){
		    int another = n - i;
		    if(prime[another] == 1){
			pass++;
		    }
		}
	    }

	    System.out.println(pass);

	}
    }
}

		

		
		