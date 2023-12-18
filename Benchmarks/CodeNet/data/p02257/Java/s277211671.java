import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	//配列の要素数
	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
	
	//配列の要素
	int A[] = new int[n];	
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<A.length;i++){
	    A[i]= sc.nextInt();
	}
	
	//初期化
	int sosu =0;
	
	//素数判定
	for(int i=0; i < n; i++){
	    int count = 0;
	    for(int j=1; j <= A[i]; j++){
		if(A[i]%j==0) count++;
	    }
	    if(count==2) sosu++;
	}
	System.out.println(sosu);
    }
}

