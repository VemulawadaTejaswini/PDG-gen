import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    int[] arr = new int[1];
    
    for(int i = 1; i < 10000000; i++) {
      if(i*8/100 == a && b == i*10/100) {
        arr[0] = i;
        break;
      }
    }
    
    if(arr[0] == 0) {
      System.out.println("-1"); 
    } else {
      System.out.println(arr[0]); 
    }
  }
}