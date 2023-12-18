import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long[] l = new long[n];

    for(int i=0; i<n; i++){
      l[i] = sc.nextInt();
    }
    
    long counter = 0;
    for(int i=0; i<n; i++){
      for(int j=i+1; j<n; j++){
        for(int k=j+1; k<n; k++){
          if(l[i] != l[j] && l[j] != l[k] && l[k] != l[i]){
            if(l[i] + l[j] > l[k] && l[j] + l[k] > l[i] && l[k] + l[i] > l[j]){
              counter++;
            }
          }
        }
      }
    }

    System.out.println(counter);
    
    return;

  }
}