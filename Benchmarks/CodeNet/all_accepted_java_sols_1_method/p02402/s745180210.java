import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 
    ArrayList<Integer> list = new ArrayList<Integer>();
    String line = sc.nextLine();
    int n = Integer.parseInt(line);
    String line1 = sc.nextLine();
    String[] linesp1 = line1.split(" ");
    for(int i = 0; i < n; i++) {
        list.add(Integer.parseInt(linesp1[i]));
    }
    int max = list.get(0);
    int min = list.get(0);
    long sum = 0;
    for(int i = 0; i < list.size(); i++) {
        int num = list.get(i);
        if(num > max) {
            max = num;
        }
        if(num < min) {
            min = num;
        }
        sum += num;
    }
    System.out.println(min + " " + max + " " + sum);
  }
}
