import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int num = sc.nextInt();
    	  int count = 0;
          List<Integer> list = new ArrayList<>();
          while (num > 0){
              list.add(num % 10);
              num /= 10;
            }
          for(int a : list) {
            if(a == 1){
              count++;
        }
          }
            System.out.println(count);
          }
    }