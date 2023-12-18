import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] data = new int[n];
    for(int i = 0; i< n; i++) {
      data[i] = sc.nextInt();
    }
    
    int output = 0;
    
    
    for(int i = 0; i<n; i++) {
      boolean isDivisible = false;
      for(int j = 0; j<n;j++) {
        if(i != j) {
          if(data[i]%data[j] == 0) {
            isDivisible=true;
            break;
          }
        }
      }
      if(!isDivisible) {
        output++;
      }
    }
    
    
    System.out.println(output);
  }
}
