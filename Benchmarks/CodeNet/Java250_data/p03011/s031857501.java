import java.util.*;
import java.util.stream.*;

class Main{
  static int sum(int[] arr){
    int n = IntStream.of(arr).sum();
    int min = Integer.MAX_VALUE;
    for(int i:arr){
      if(n-i<min){
        min = n-i;
      }
    }
    return min;
  }
  public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	int[] arr = new int[3];
    	for(int i=0;i<3;i++){
          arr[i] = scan.nextInt();
        }
    System.out.println(sum(arr));
  }}