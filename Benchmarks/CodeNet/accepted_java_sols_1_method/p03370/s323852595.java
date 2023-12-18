import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int m[] = new int [n];
    int count = 0;
    for(int i = 0;i < n;i++){
      m[i] = sc.nextInt();
    }
    Arrays.sort(m);
    for(int i = 0;i < n;i++){
      x -= m[i];
      count++;
    }
    while(x >= 0){
      x -= m[0];
      count++;
    }
    count--;
    System.out.println(count);
  }
}