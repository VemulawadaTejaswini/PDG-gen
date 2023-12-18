import java.util.*;

class Main {

    static Stack<Integer> cars;

    static void treat (int car) {
        
        if(car != 0) {
            cars.push(car);
        } else {
            System.out.println(cars.pop());
        }
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        cars = new Stack<Integer>();

        while (sc.hasNext()) {
            int car = sc.nextInt();
            treat(car); 
        }

    }
}