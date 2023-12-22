import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();  //点の個数
	int now_t = 0;
	int now_x = 0;
	int now_y = 0;
	
	int[] t_ = new int[N];
	int[] x_ = new int[N];
	int[] y_ = new int[N];

	for(int i = 0; i < N; i++){
	    t_[i] = scan.nextInt();
	    x_[i] = scan.nextInt();
	    y_[i] = scan.nextInt();
	}

	int flag = 1;
	for(int i = 0; i < N; i++){
	    int len_t = t_[i]-now_t;
	    int len_x = Math.abs(now_x-x_[i]);
	    int len_y = Math.abs(now_y-y_[i]);
	    if(len_t >= len_x+len_y &&
	       (len_t-len_x-len_y) % 2 == 0){
		//移動できる
		now_t = t_[i];
		now_x = x_[i];
		now_y = y_[i];
	    }else{
		flag = -1;
		break;
	    }
	}

	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}
