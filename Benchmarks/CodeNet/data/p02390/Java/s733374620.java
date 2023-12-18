import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sec = sc.nextInt();
    
    if(0 <= sec && sec <= 86400) {
        int h = sec / 3600;
        int m = (sec - (3600 * h)) / 60;
        int s = sec - (h * 3600 + m * 60);
        System.out.println(h + ":" + m + ":" + s);
    }else {
        System.out.println("??£??????????????\?????????????????????");
    }
  }    
}