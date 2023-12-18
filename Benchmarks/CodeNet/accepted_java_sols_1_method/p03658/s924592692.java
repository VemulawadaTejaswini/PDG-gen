import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] l = new int[n];
    for(int i=0; i<n; i++){
      l[i] = sc.nextInt();
    }
    Arrays.sort(l);
    int count = 0;
    int sum = 0;
    while(count < k){
      sum += l[l.length-1-count];
      count++;
    }
    System.out.println(sum);

    sc.close();
  }
}