import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int[] H_ = new int[N];
	for(int i = 0; i < N; i++){
	    H_[i] = scan.nextInt();
	}

	int count = 1;
	for(int i = 1; i < N; i++){
	    int flag = 1;
	    for(int j = i-1; j >= 0; j--){
		if(H_[i] < H_[j]){
		    flag = 0;
		    break;
		}
	    }
	    if(flag == 1){
		count++;
	    }else{
	    }
	}

	System.out.println(count);
    }
}
