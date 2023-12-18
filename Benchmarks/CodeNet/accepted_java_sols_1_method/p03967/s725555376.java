import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String topCoDeer = sc.nextLine();
        char[] chars = topCoDeer.toCharArray();
        int gooSurplus = 0;
        for(int i = 0; i < chars.length; i++) {
            if (chars[i] == 'g') {
                gooSurplus++;
            } else {
                gooSurplus--;
            }
        }
        int answer = (int) Math.floor(gooSurplus/2);
        System.out.println(answer);
    }
}