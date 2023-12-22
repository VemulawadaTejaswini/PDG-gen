import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int A;   //高橋くんのクッキー
	int B;   //青木くんのクッキー
	int K;   //交換回数

	A = scan.nextInt();
	B = scan.nextInt();
	K = scan.nextInt();

	for(int i = 0; i < K; i++){
	    //偶数
	    if(A % 2 == 0){
	    }
	    //奇数
	    else{
		A--;
	    }

	    A /= 2;
	    B += A;

	    //先攻後攻交代
	    int tmp = A;
	    A = B;
	    B = tmp;
	}

	if(K % 2 == 0){
	    System.out.println(A + " " + B);
	}else{
	    System.out.println(B + " " + A);
	}
    }
}
