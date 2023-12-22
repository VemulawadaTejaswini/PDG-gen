import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();

	int max = 0;
	int max_num = 1;
	for(int i = 1; i <= N; i++){
	    int tmp = i;
	    int count = 0;
	    while(true){
		if(tmp % 2 == 0){
		    count++;
		    tmp /= 2;
		}else{
		    break;
		}
	    }
	    if(count > max){
		max = count;
		max_num = i;
	    }
	}

	System.out.println(max_num);
    }
}
