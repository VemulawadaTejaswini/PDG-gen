import java.util.Scanner;

public class Main {

	void run()
	{
		Scanner scan = new Scanner(System.in);
	    int n, i, j, a_index=0, b_index=0, check=0;
	    int[] data = new int[10];
	    int[] tube_a = new int[10];
	    int[] tube_b = new int[10];
	    n = scan.nextInt();
	    for(i = 0; i < n; i++, check = 0, a_index=1, b_index=0){
	        for(j = 0; j < 10; j++){
	            data[j] = scan.nextInt();
	        }
	        tube_a[0] = data[0];
	        for(j = 1; j < 10; j++){
	            if(data[j] < tube_a[a_index - 1]){
	                if(b_index == 0){
	                    tube_b[b_index++] = data[j];
	                }else if(tube_b[b_index - 1] < data[j]){
	                    tube_b[b_index++] = data[j];
	                }else{
	                    System.out.println("NO");
	                    check = 1;
	                    break;
	                }
	            }else{
	                tube_a[a_index++] = data[j];
	            }
	        }
	        if(check == 0) System.out.println("Yes");
	    }
	}
	
	public static void main(String[] args) {
		new Main().run();

	}

}