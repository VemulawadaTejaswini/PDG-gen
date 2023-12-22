import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    int[] ar = new int[n];
    for(int i=0;i<n;i++){
      ar[i] = sc.nextInt();
    }
    for(int j=1;j<n-1;j++){
      if((ar[j-1] < ar[j] && ar[j] < ar[j+1]) || (ar[j-1] > ar[j] && ar[j] > ar[j+1])){
        count++;
      }
    }
    System.out.println(count);
  }
}