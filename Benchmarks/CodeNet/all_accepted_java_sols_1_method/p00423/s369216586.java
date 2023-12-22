import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        while(true){
            int in = scan.nextInt();
            if(in == 0) return;

            int aSum = 0;
            int bSum = 0;
            for(int i = 0; i < in; i++){
                int a = scan.nextInt();
                int b = scan.nextInt();
                if(a > b){
                    aSum += a+b;
                }else if(a < b){
                	bSum += a+b;
                }else{
                	aSum += a;
                	bSum += b;
                }
            }
            System.out.println(aSum +" "+ bSum);
        }
	}
}