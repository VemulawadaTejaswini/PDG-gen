import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> bottom = new ArrayList<Integer>();
        
        while (scanner.hasNext()) {
            int car = scanner.nextInt();
            
            if (car == 0) {
                int exitCar = bottom.get(bottom.size()-1);
                System.out.println(exitCar);
                bottom.remove(bottom.size()-1);
            } else {
                bottom.add(car);
            }
        }
    }
}