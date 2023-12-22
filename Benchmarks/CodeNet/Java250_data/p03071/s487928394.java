import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int[] num;
    num = new int[3];
    num[0] = A+B ;
    num[1] = 2*A-1 ;
    num[2] = 2*B-1 ;

    int max = 0;
    for(int i = 0; i < num.length ; i++) {
        if(max < num[i]) {
            max = num[i];
        }
    }
    System.out.println(max);
  }
}