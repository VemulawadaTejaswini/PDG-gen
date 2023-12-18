import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] forecast = sc.next().toCharArray();
        char[] weather = sc.next().toCharArray();
        int hit = 0;
        for(int i=0; i<forecast.length; i++){
            if(forecast[i]==weather[i]) hit++;
        }
        System.out.println(hit);
    }
}