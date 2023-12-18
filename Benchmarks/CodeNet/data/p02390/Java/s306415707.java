import static java.lang.Integer.parseInt;

public class Main {
    public static void main (String[] args) {
        String line = new java.util.Scanner ( System.in ).nextLine();
        String hour = watch (line);
        System.out.println(hour);
    }
    public static String watch(String line){
        int hour,min,second;
        second = parseInt(line);
        if (second < 0 || second > 86400) {
            System.out.println("Constraints Error");
            return null;
        }
        hour = second / 3600;
        min = (second % 3600 ) / 60;
        second = second % 60;
        
        return hour + ":" + min + ":" + second;
    }
}