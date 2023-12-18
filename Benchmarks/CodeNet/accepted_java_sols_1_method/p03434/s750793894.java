import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    Integer[] num = new Integer[number];
   	for (int i=0; i<number; i++) {
         num[i] = sc.nextInt();
     }
     Arrays.sort(num, Comparator.reverseOrder());
    
    int Alice = 0;
    int Bob   = 0;
    for (int i=0; i<number; i+=2) {
        Alice += num[i];
    }
    for (int i=1; i<number; i+=2) {
        Bob += num[i];
    }
    System.out.println(Alice - Bob);
  }
}