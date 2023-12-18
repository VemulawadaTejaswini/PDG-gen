import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{


	public static void main(String[] args){

    	Scanner scan = new Scanner(System.in);

				try{
            int n=scan.nextInt();

            call(n);


				}catch(InputMismatchException e){
					System.out.println("??¨??????:"+e);
				}
        	scan.close();


	}

	public static void call(int n){

		for(int i=1;i<n+1;i++){

			if(i%3==0 ||i%10==3){
				System.out.print(" "+i);
			}


		}System.out.print('\n');


	}

}