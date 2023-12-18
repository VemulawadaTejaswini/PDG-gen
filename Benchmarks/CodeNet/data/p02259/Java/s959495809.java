import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    int array_length = scan.nextInt();

    int[] array =new int[array_length];
    for (int i = 0; i < array_length; i++) {
      array[i] = scan.nextInt();
    }

    bubbleSort(array_length, array);
  }

  public static void printArray(int array[], int count) {
  	for (int i = 0; i < array.length-1 ; i++) {
  	    System.out.print(array[i] + " ");
  	}
    System.out.println(array[array.length-1]);
  	System.out.println(count);
  }

  public static void bubbleSort(int n, int array[]){

    int count = 0;
    for(int i = 0; i < n; i++){
      for(int j = n-1; j >= i+1; j--){
        if(array[j] < array[j-1]){
          int swap = array[j];
          array[j] = array[j-1];
          array[j-1] = swap;
          count++;
        }
      }
    }
    printArray(array, count);


  }
}
