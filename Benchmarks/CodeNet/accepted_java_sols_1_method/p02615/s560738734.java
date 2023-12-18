import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int member = scan.nextInt();
        Integer[] friend = new Integer[member];
      
      	for(int i=0;i<member;i++){
          friend[i] = scan.nextInt();
        }
      
        Arrays.sort(friend, Comparator.reverseOrder());
      
      	long point = friend[0];
      	for(int k=2;k<member;k++){
            point = point + friend[(int)k/2];
        }
      System.out.println(String.valueOf(point));
    }
}