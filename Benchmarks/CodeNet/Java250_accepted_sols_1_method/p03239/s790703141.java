import java.util.Scanner;



class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int score = 1000;
    	int scorecount =0;
    	int N=sc.nextInt();
    	int T=sc.nextInt();
    	int A[] = new int[N];
		int B[] = new int[N];

    	for(int i = 0;i<N;i++){
    		A[i]= sc.nextInt();
    		B[i]=sc.nextInt();

    	if(A[i]<=score && B[i]<=T){
    		score = A[i];
    		scorecount++;
    	}

    	}
    	if(score == 1000 && scorecount == 0){
    		System.out.println("TLE");
    	}else{
    		System.out.println(score);
    	}



    }
}