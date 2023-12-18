import java.util.*;

class MySelectionSort {
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);
	int[] a = new int[100];
	int n, temp, count = 0;
	int i, j, minj;

	n = stdIn.nextInt();

	for(i = 0; i < n; i++)
	    a[i] = stdIn.nextInt();

	for(i = 0; i < n - 1; i++) {
	    minj = i;
	    for(j = i; j < n; j++) {
		if(a[j] < a[minj]) {
		    minj = j;
		}
	    }
	    if(a[i] > a[minj]) {
		temp = a[i];
		a[i] = a[minj];
		a[minj] = temp;
		count++;
	    }
	}

	for(i = 0; i < n; i++){
	    System.out.print(a[i]);
	    if(i < n - 1) System.out.print(" ");
	}
	System.out.println();
	System.out.println(count);
		
    }
}