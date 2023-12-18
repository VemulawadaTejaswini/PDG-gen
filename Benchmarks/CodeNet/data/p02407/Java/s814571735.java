import java.util.*;

class Main{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int numbers[] = new int[n];
    int i = n;
    int j = 0;
    int k = 0;
    while (i>=1) {
      j = sc.nextInt();
      numbers[i-1] = j;
      i--;
    }
    while (k<=n-2) {
      System.out.print(numbers[k]+ " ");
      k++;
    }
    System.out.print(numbers[n-1]);
    System.out.println();
  }
}

