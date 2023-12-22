import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{


	public static void main(String[] args){

    	Scanner scan = new Scanner(System.in);

			while(true){
				try{
            int H=scan.nextInt();
			int W=scan.nextInt();
			if(H==0&&W==0)break;

			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					System.out.print('#');
				}System.out.print('\n');
			  }System.out.print('\n');

				}catch(InputMismatchException e){
					System.out.println("??¨??????:"+e);

				}

			}
        	scan.close();


	}

}