import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true){
		    boolean flag[] = new boolean[10];
		    int in = s.nextInt();
		    int a = 1024;
     		    for(int i=9 ; i>=0 ; i--){
			a /= 2;
			if(in>=a){
			    in -= a;
			    flag[i] = true;
			}
		    }
		    int b = 1;
		    for(int i=0 ; i<10 ; i++){
			if(flag[i]==true)
			    System.out.print(b + " ");
			b *= 2;
		    }
		    System.out.println();
		}
	}
}