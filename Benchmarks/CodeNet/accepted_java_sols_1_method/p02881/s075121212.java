import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long res;

        long max=1;
        for(int i=1; i<Math.sqrt(N)+1; i++){
            if(N%i==0){

                max = i;

            }
        }
        res = max+N/max-2;
        System.out.println(res);
	}
}