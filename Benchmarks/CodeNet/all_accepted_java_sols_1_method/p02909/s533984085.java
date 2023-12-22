import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(s.equals("Sunny")){
            System.out.println("Cloudy");
        } else if(s.equals("Cloudy")){
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}