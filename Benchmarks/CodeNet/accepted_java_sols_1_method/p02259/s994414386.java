import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	int n = stdin.nextInt();
	int[] num = new int[100];
	int cnt = 0;

	for ( int i = 0; i < n; i++ ){
	    num[i] = stdin.nextInt();
	}

	int flag = 1;
	while ( flag == 1 ){
	    flag = 0;
	    for ( int j = n-1; j > 0; j-- ){
		if ( num[j] < num[j-1] ){
		    int tmp = num[j];
		    num[j] = num[j-1];
		    num[j-1] = tmp;
		    flag = 1;
		    cnt++;
		}
	    }
	}

	System.out.print(num[0]);
	for ( int i = 1; i < n; i++ ){
	    System.out.print(" " + num[i]);
	}
	System.out.println();
	System.out.println(cnt);

    }
}