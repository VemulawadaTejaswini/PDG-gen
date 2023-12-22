import java.util.Scanner;

class Main { 
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int[] numbers = new int[N];
    for (int i = 0; i < N; i++) {
      numbers[i] = in.nextInt();
    }
    int count = bubbleSort(numbers);
    trace(numbers);
    System.out.println(count);
  }
  
  public static int bubbleSort(int[] array) {
    int count = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = array.length - 1; j >= i + 1; j--) {
        if (array[j] < array[j - 1]) {
          swap(array, j, j - 1);
          count++;
        }
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