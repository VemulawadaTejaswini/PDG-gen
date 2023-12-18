
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String w = sc.nextLine();
        String[] weather = {"Sunny", "Cloudy", "Rainy"};

        for (int i = 0; i < 3; i++) {
            if (w.equals(weather[i]))
                System.out.println(weather[(i + 1) % 3]);
        }


    }
}


