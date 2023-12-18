import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int nx = stdIn.nextInt();
        int [] x = new int[nx];
		int times = 0;
        int work;

        for(int i = 0; i < nx; i++){
        	x[i] = stdIn.nextInt();
        }

		for (int i = 0; i < x.length - 1; i++) {
            for (int j = x.length -1; j >= i+1; j--) {
                    if(x[j] < x[j-1]){
                        work = x[j-1];
                        x[j-1] = x[j];
                        x[j] = work;
            		    times++;
                    }
            }
        }
        out_put(x);
        System.out.println(times);
	}
	private static void out_put(int array[]){

        System.out.printf("%d", array[0]);

        for(int i = 1; i < array.length; i++){
            System.out.printf(" %d", array[i]);
        }
        System.out.printf("\n");
    }

}

