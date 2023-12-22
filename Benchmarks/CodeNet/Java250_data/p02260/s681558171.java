import java.util.Scanner;

class Main { 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] numbers = new int[N];
    for (int i = 0; i < N; i++) {
      numbers[i] = in.nextInt();
    }
    int count = selectionSort(numbers);
    trace(numbers);
    System.out.println(count);
  }
  
  public static int selectionSort(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      int mini = i;
      for (int j = i; j < array.length; j++) {
        if (array[j] < array[mini]) mini = j;
      }
      if (mini != i ) {
        swap(array, i, mini);
        count++;
      }
    }
    return count;
  }
  
  public static void swap(int[] array, int p, int q) {
    int temp = array[p];
    array[p] = array[q];
    array[q] = temp;
  }
  
  public static void trace(int[] array) {
    StringBuilder output = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      output.append(array[i]);
      if (i != array.length -1) output.append(" ");
    }
    System.out.println(output.toString());
  }
}