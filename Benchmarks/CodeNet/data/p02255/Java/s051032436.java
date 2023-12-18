import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int array_length = scan.nextInt();

    int[] array =new int[array_length];
    for (int i = 0; i < array_length; i++) {
      array[i] = scan.nextInt();
    }

    printArray(array);

    InsertionSort(array_length, array);
  }

  public static void printArray(int array[]) {
  	for (int i = 0; i < array.length - 1; i++) {
  	    System.out.print(array[i] + " ");
  	}
  	System.out.println(array[array.length-1]);
  }

  public static void InsertionSort(int n, int array[]){
    for(int i = 1; i < n; i++){
      int key = array[i];

      int j = i - 1;
      while(j >= 0 && array[j] > key){
        array[j+1] = array[j];
        j--;
        array[j+1] = key;
      }
      printArray(array);
    }


  }
}
