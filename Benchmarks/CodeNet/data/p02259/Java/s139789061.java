import java.util.*;

class MyBubbleSort {
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	int[] a = new int[100];
	int n, temp, flag = 1, count = 0;
	int i, j;

	n = stdIn.nextInt();

	for(i = 0; i < n; i++)
	    a[i] = stdIn.nextInt();

	while(flag == 1) {
	    flag = 0;
	    for(j = n - 1; j > 0; j--){
		if(a[j] < a[j-1]) {
		    temp = a[j];
		    a[j] = a[j-1];
		    a[j-1] = temp;
		    flag = 1;
		    count++;
		}
	    }
	}
	
	for(i = 0; i < n; i++) {
	    System.out.print(a[i]);
	    if(i != n - 1) System.out.print(" ");
	}
	System.out.println();
	System.out.println(count);
	
    }
}