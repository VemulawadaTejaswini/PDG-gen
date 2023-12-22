import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String todayWeather = scanner.next();
//        System.out.println(todayWeather.equals("Sunny") ? "Cloudy" : todayWeather.equals("Cloudy") ? "Rainy" : "Sunny");

        Scanner scanner = new Scanner(System.in);
        String stepStrng = scanner.next();

        char[] stepChar = new char[stepStrng.length()];
        for(int i = 0; i < stepStrng.length(); i++){
            stepChar[i] = stepStrng.charAt(i);
        }

        boolean easy = true;
        for (int i = 0; i < stepChar.length; i++) {
            if (i % 2 == 0 && (stepChar[i] == 'R' || stepChar[i] == 'U' || stepChar[i] == 'D')) {
                continue;
            } else if (i % 2 == 1 && (stepChar[i] == 'L' || stepChar[i] == 'U' || stepChar[i] == 'D')) {
                continue;
            } else {
                easy = false;
            }
        }

        System.out.println(easy ? "Yes" : "No");

    }
}
