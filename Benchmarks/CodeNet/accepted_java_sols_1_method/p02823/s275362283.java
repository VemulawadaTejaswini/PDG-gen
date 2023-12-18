import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long low = sc.nextLong();
    long high = sc.nextLong();
    
    long diff = high-low;
    long result = 0;
    if (diff%2==0) {
      result = diff/2;
    }
    else {
      long near;
      long far;
      if (n-high<low-1) {
        near = n-high;
        far = n-low;
      }
      else {
        near = low-1;
        far = high-1;
      }
      result += near+1;
      result += (far-near-1)/2;
      
    }
    
    System.out.println(result);
  }
}
