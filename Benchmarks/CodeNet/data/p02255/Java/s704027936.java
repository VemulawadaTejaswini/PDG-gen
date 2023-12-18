import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int a = in.nextInt();
    	int[] ints = new int[a];
    	
    	for (int i=0; i<a; i++) {
            ints[i] = in.nextInt();
        }
    	int MyArray;
    	for (int i=0; i<a; i++) {
    		MyArray = ints[i];
            
            int j = i - 1;
            while (j>=0 && ints[j]>MyArray) {
                ints[j+1] = ints[j];
                j--;
            }
            ints[j+1] = MyArray;
            
            for (int o=0; i<ints.length; o++) {
                System.out.print(ints[o]);
                if (i!=ints.length-1) {System.out.print(" ");}
        }
    	}
            
            
    	       
}
}
