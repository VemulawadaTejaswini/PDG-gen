import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	while(s.hasNext()){
	    int[] a = new int[5];
	    for(int i=0 ; i<5 ; i++)
		a[i] = s.nextInt();
	    int b = Math.min(a[0],a[1]);
	    b = Math.min(b,a[2]);
	    int c = Math.min(a[3],a[4]);
	    System.out.println(b+c-50);
	}
    }
}