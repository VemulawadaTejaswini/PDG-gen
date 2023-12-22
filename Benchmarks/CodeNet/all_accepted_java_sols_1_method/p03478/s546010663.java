import java.util.Scanner;

class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int A = scan.nextInt();
	int B = scan.nextInt();
	int sum = 0;

	//1~Nまでの数値で条件判定
	for(int i = 1; i <= N; i++){
	    int sub = i;
	    int subsum = 0;
	    while(sub > 0){
		subsum += sub % 10;
		sub /= 10;
	    }
	    if(A <= subsum && subsum <= B){
		sum += i;
	    }else{
	    }
	}

	System.out.println(sum);
    }
}