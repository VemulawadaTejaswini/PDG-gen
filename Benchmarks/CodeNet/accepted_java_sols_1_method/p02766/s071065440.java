import java.util.Scanner;


public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String ss = sc.next();


        int N = Integer.parseInt(s);
        int R = Integer.parseInt(ss);

        int cont = 0;
        while(N > 0) {
        	N = N / R;
        	cont ++;
        }
        System.out.println(cont);
	}
}