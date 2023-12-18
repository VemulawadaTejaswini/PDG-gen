import java.util.*;

public class Main{

  static int h;
  static long[] a;

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    h = sc.nextInt();
    a = new long[h+1];
    for (int i=1; i<=h; i++){
      a[i] = sc.nextLong();
    }
    buildMaxHeap();
    for (int i=1; i<=h; i++){
      System.out.print(" "+a[i]);
    }
    System.out.println();
  }

  public static int left(int i){
    return 2*i;
  }

  public static int right(int i){
    return 2*i+1;
  }

  public static int parent(int i){
    return i/2;
  }

  public static void maxHeapify(int i){
    int l = left(i);
    int r = right(i);
    int largest;
    if (l <= h && a[l]>a[i]){
      largest = l;
    } else {
      largest = i;
    }
    if (r <= h && a[r] > a[largest]){
      largest = r;
    }

    if (largest != i){
      long t = a[i];
      a[i] = a[largest];
      a[largest] = t;
      maxHeapify(largest);
    }
  }

  public static void buildMaxHeap(){
    for (int i=h/2; i>0; i--){
      maxHeapify(i);
    }
  }
}
