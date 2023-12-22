import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int[] x_ = new int[5];
	int[] y_ = new int[5];

	for(int i = 0; i < 5; i++){
	    x_[i] = scan.nextInt();
	}

	for(int i = 0; i < 5; i++){
	    y_[i] = x_[i] % 10;
	}

	int diff = 10;
	int diff_num = -1;
	for(int i = 0; i < 5; i++){
	    if(diff > y_[i] && y_[i] != 0){
		diff = y_[i];
		diff_num = i;
	    }
	}

	int sum = 0;
	for(int i = 0; i < 5; i++){
	    if(diff_num == i || y_[i] == 0){
		sum += x_[i];
	    }else{
		sum += x_[i]+(10-y_[i]);
	    }
	}

	System.out.println(sum);
    }
}
   
