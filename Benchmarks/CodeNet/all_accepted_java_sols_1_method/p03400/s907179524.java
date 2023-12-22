import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N= Integer.parseInt(s);

        s = sc.nextLine();
        String[] array = s.split(" ");

        int D= Integer.parseInt(array[0]);
        int X= Integer.parseInt(array[1]);//SUM


        for (int i = 0; i < N; i++) {
        	s = sc.nextLine();
        	int a= Integer.parseInt(s);

        	for(int k=0;;k++) {
        		if(a*k > D-1) {
        			X+=k;
        			break;
        		}
        	}
        }

        System.out.println(X);

	}

}