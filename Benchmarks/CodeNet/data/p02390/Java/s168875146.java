import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        System.out.println(time/3600 + ":" + time%3600/60 + ":" + time%60);
    }
}

