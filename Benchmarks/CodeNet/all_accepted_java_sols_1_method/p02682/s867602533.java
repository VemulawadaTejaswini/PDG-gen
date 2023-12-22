import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int count1 = sc.nextInt();
    int count0 = sc.nextInt();
    int countMinus1 = sc.nextInt();
    int count = sc.nextInt();
    
    sc.close();
    

    int x = 0;
    int y = 0;
    int z = 0;
    
    x = count - count1 > 0 ? count1 : count;
    count -= x;
    
    if (count != 0) {
      y = count - count0 > 0 ? count0 : count;
      count -= y;
      
      if (count != 0) {
        z = count - countMinus1 > 0 ? countMinus1 : count;
      }
    }
    int answer = 1 * x + 0 * y + (-1 * z);
    
    System.out.println(answer);
    
  }
}