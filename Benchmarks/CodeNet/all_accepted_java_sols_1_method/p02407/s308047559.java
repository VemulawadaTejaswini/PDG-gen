import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int list[] = new int[n];
    for(int i = 0; i < n; i++){
      int a = sc.nextInt();
      list[i] = a;
    }
    for(int i = 0; i<n/2; i++){
      int temp = list[i];
      list[i] = list[(n-1)-i];
      list[(n-1)-i] = temp;
    }
    for(int i = 0; i<n; i++){
      if(i != (n-1)){
        System.out.print(list[i] + " ");
      }else{
        System.out.print(list[i]);
      }
    }
    System.out.println();
  }
}
