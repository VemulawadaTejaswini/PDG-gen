import java.util.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String weather = sc.next();
        
        if (weather.equals("RSS") || weather.equals("SRS") || weather.equals("SSR") || weather.equals("RSR")) {
            System.out.println(1);
        } else if (weather.equals("RRS") || weather.equals("SRR")) {
            System.out.println(2);
        } else if (weather.equals("RRR")) {
            System.out.println(3);
        } else {
            System.out.println(0);
        }
        
    }
}