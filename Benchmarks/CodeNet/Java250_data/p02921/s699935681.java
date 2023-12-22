import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.Collections;
        import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String forecast = sc.next();
        String actual = sc.next();
        char[] forecastChar = forecast.toCharArray();
        char[] actualChar = actual.toCharArray();
        
        int counter = 0;
        for (int i = 0; i < 3; i++) {
            
            if (forecastChar[i] == actualChar[i]) {
                counter++;
            }
            
        }
        
        System.out.println(counter);

    }
}