import java.util.*;
 
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] m = new int[n];
    int min = Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
      m[i] = sc.nextInt();
      x -= m[i];
      if(min > m[i]){
        min = m[i];
      }
    }
    int count = m.length;
    while(x >= 0){
      x -= min;
      count++;
    }
    System.out.println(count-1);

    sc.close();
  }
}
