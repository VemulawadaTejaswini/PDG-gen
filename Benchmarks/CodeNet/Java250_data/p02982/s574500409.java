import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer d = scanner.nextInt();
        
        int result = 0;
        List<List<Integer>> points = new ArrayList<List<Integer>>();
        
        for(int k = 0 ; k < n ; k++) {
          List<Integer> point = new ArrayList<Integer>();
          for(int j = 0 ; j < d; j++) {
            point.add(scanner.nextInt());
          }
          points.add(point);
        }
        
        
        for(int f = 0; f < n-1 ; f++) {
          for(int s = f + 1; s< n ;s++) {
            if(hasIntDist(points.get(f),points.get(s))) {
               result++;
            }
          }
        }
        System.out.println(result);
    }
    
    static boolean hasIntDist(List<Integer> p1, List<Integer>p2) {
      int sum = 0;
      for(int a = 0 ; a < p1.size();a++) {
        sum += (p1.get(a) - p2.get(a)) * (p1.get(a) - p2.get(a));
      }
      
      return isSquare(sum);
    }
    static boolean isSquare(int num) {
      double root = Math.sqrt(num);
      
      int castedRoot = (int) (root / 1.0);
      return (castedRoot *castedRoot) == (num) ;
    }
}