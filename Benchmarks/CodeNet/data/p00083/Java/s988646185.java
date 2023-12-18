import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] d = sc.nextLine().split(" ");
            String month = null, day = null;
            if (d[1].length() == 1) {
                month = "0" + d[1];
            } else {
                month = d[1];
            }
            if (d[2].length() == 1) {
                day = "0" + d[2];
            } else {
                day = d[2];
            }
            int date = Integer.parseInt(d[0] + month + day);
            if (date >= 19890108) {
                System.out.println("heisei" + " " + (Integer.parseInt(d[0]) - 1988) + " " + d[1] + " " + d[2]);
            } else if (date >= 19261225) {
                System.out.println("showa" + " " + (Integer.parseInt(d[0]) - 1925) + " " + d[1] + " " + d[2]);
            } else if (date >= 19120730) {
                System.out.println("taisho" + " " + (Integer.parseInt(d[0]) - 1911) + " " + d[1] + " " + d[2]);
            } else if (date >= 18680908) {
                System.out.println("meiji" + " " + (Integer.parseInt(d[0]) - 1867) + " " + d[1] + " " + d[2]);
            } else {
                System.out.println("pre-meiji");
            }
        }
    }
}