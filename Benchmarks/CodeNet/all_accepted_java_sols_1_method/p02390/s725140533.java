import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        int hours = second / 3600;
        int minutes = (second - 3600 * hours)/60;
        int seconds = second - 3600 * hours - 60 * minutes;
        
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
