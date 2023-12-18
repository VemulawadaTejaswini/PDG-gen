import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

class Main{
          public static void main(String[] args) {
                  Scanner scan = new Scanner(System.in);
                  int count = 0;
                  int N = scan.nextInt();
                  int a[] = new int[N];
                  for (int i = 0; i < N; i++) {
                          a[i] = scan.nextInt();
                  }
                  for(int j = 1; j < N; j++){
                          if (a[j-1] == a[j]) {
                                  a[j] = 10001;
                                  count++;
                          }
                  }
                  System.out.println(count);
                  }
}
