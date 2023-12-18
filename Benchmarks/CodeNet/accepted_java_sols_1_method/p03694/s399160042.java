import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int n = scanner.nextInt();
	    int[] array = new int[n];
	    for(int i=0; i<n; i++) {
	        array[i] = scanner.nextInt();
        }

		int tmp;
	    for(int j=0; j<array.length; j++) {
			if(array[0] < array[j]) {
				tmp = array[0];
				array[0] = array[j];
				array[j] = tmp;
			}
        }
	    int maxVal = array[0];
	    for (int k=0; k<array.length; k++) {
	    	if(array[0] > array[k]) {
	    		array[0] = array[k];
			}
		}
	    int minVal = array[0];
	    System.out.println(maxVal-minVal);
    }
}