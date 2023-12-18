import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Main {
  private static int maxPoints(int[] arr){
    Arrays.sort(arr);
    
    // start with the biggest
    
    PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b[0],a[0]));
    
    int maxPoints = 0;
    // put the first element in the pq
    int lastElement = arr[arr.length-1];
    maxHeap.offer(new int[]{lastElement,lastElement});
    
    for(int i=arr.length-2;i>=0;i--){
      int[] neighbors = maxHeap.poll();
      //System.out.println(Arrays.toString(neighbors) );
      maxPoints+=neighbors[0];
      maxHeap.offer(new int[]{arr[i],neighbors[0]});
      maxHeap.offer(new int[]{arr[i],neighbors[1]});
    }
    return maxPoints;
  }
  public static void main(String[] args) {
//     PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b[0],a[0]));
//     maxHeap.add(new int[]{4,4});
//     maxHeap.add(new int[]{2,4});
//     maxHeap.add(new int[]{3,4});
    
//     while(!maxHeap.isEmpty()){
//       System.out.println(Arrays.toString(maxHeap.poll()));
//     }
    
    //System.out.println(maxPoints(new int[]{1,1,1,1,1,1,1}));
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(maxPoints(arr));
  }
}
