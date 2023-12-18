import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> color = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if(tmp < 400) color.add("gray");
            else if(tmp < 800) color.add("brown");
            else if(tmp < 1200) color.add("green");
            else if(tmp < 1600) color.add("lightbrue");
            else if(tmp < 2000) color.add("brue");
            else if(tmp < 2400) color.add("yellow");
            else if(tmp < 2800) color.add("orange");
            else if(tmp < 3200) color.add("red");
            else list.add(tmp);
        }
        int min = Math.max(1, color.size());
        int max = color.size() + list.size();
        System.out.println(min + " " + max);
    }
}
