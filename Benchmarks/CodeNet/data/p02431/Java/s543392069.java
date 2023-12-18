import java.util.Scanner;

public class Main{

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int nx = stdIn.nextInt();
        int [] x = new int[nx];
        int j = 0;

            for(int i = 0; i < nx; i++){
                switch(Integer.valueOf(stdIn.nextInt())) {
                case 0:
        	    	   x[j] = stdIn.nextInt();
        		   j++;
        		   break;
                case 1:
        		System.out.println(x[stdIn.nextInt()]);
        		break;
                case 2:
        		j--;
        		x[j] = 0;
        		break;
                             }
            }

	}
}

