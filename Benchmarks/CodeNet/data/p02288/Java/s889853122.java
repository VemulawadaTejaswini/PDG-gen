import java.util.*;
import java.util.stream.*;
import java.io.*;

public class Main {

  static int n;
  static int[] a;

  
  public static void main(String[] args) throws Exception {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String[] in = br.readLine().split(" ");
    n = Integer.parseInt(in[0]);
    in = br.readLine().split(" ");
    a = Stream.of(in).mapToInt(Integer::parseInt).toArray();

    Heap h = new Heap(a);
    
    br.close();

    h.buildMaxHeap();

    for(int i = 0; i < h.length; i++){
      System.out.print(" " + h.ar[i]);
    }
    System.out.println();
  }
}


class Node {
  int v;
  Node p, l, r;

  Node(int v){
    this.v = v;
  }
}

class Heap {

  static final int INITIAL_VAL = Integer.MIN_VALUE;
  int length;
  int[] ar;

  Heap(int n){
    this.length = n;
    this.ar = new int[n];
    Arrays.fill(ar, INITIAL_VAL);
  }

  Heap(int[] ori){
    this.length = ori.length;
    this.ar = ori.clone();
  }

  // MUST be tested
  // data in "ar" may be LOST
  //   when newSize < length
  public void resize(int newSize){
    int[] newAr = new int[newSize];
    for(int i = 0; i < Math.min(length, newSize); i++){
      newAr[i] = ar[i];
    }
    ar = newAr;
  }

  public void buildMaxHeap(){
    for(int i = length / 2; i >= 0; i--){
      maxHeapify(i);
    }
    return;
  }

  public void maxHeapify(int idx){
    int lIdx = 2 * idx + 1, rIdx = 2 * idx + 2;
    int largest = idx;

    if(lIdx < length && ar[lIdx] > ar[idx]){
      largest = lIdx;
    }
    if(rIdx < length && ar[rIdx] > ar[largest]){
      largest = rIdx;
    }

    if(largest != idx){
      int tmp = ar[idx];
      ar[idx] = ar[largest];
      ar[largest] = tmp;
      maxHeapify(largest);
    }
    return;
  }

  @Override
  public String toString() {
    StringBuilder ret = new StringBuilder("length = " + length + ",\n{ ");
    for(int i = 0; i < length; i++){
      if(i > 0) ret.append(", ");
      ret.append(ar[i]);
    }
    ret.append(" }");
    return ret.toString();
  }

}
