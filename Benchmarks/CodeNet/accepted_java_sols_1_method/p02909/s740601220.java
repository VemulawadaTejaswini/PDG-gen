import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s[] = new String [3];
        s[0] = "Sunny";
        s[1] = "Cloudy";
        s[2] = "Rainy";
        
        String today = stdIn.next();
        System.out.println(s[0].equals(today) ? s[1] : (today.equals(s[1]) ? s[2] : s[0]));
    }
}