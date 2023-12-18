import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int[] heights = new int[10];
    for(int i=0;i<10;i++) {
      int height = sc.nextInt();
      heights[i] = height;
    }
    Arrays.sort(heights);
    System.out.println(heights[9]);
    System.out.println(heights[8]);
    System.out.println(heights[7]);
  }
}