import java.util.Scanner;

class Main{

    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	while(true){
	    int n = scan.nextInt();

	    if(n == 0){
		break;
	    }

	    int[][] data = new int[n][3];
	    int[] sum = new int[n];
	    
	    for(int i = 0; i < n; i++){
		sum[i] = 0;
	    }

	    for(int i = 0; i < n; i++){
		data[i][0] = scan.nextInt();
		data[i][1] = scan.nextInt();
		data[i][2] = scan.nextInt();
		sum[i] = data[i][1] + data[i][2];
	    }


	    int stock;

	    for(int i = 0; i < n - 1; i++){
		for(int j = i; j < n; j++){
		    if(sum[i] < sum[j]){
			stock = sum[i];
			sum[i] = sum[j];
			sum[j] = stock;
			stock = data[i][0];
			data[i][0] = data[j][0];
			data[j][0] = stock;
		    }
		}
	    }
    

	    System.out.println(data[0][0] + " " + sum[0]);
	}
    }
}
	