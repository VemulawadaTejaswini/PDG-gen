import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner s = new Scanner(System.in);
	int n;
	int[] array;
	array = new int[100];
	n = s.nextInt();
	for(int i = 0 ; i < n ; i++){
	    array[i] = s.nextInt();
	}

	for(int i = n-1 ; i > 0 ; i--){
	    System.out.printf("%d ", array[i]);
	}
	System.out.printf("%d\n", array[0]);
    }
}