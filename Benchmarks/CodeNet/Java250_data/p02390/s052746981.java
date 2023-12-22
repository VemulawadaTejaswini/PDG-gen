import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            String[] line = sc.nextLine().split(" ");
            int inputtime = Integer.parseInt(line[0]);
            int hour = inputtime/3600;
            int minute = inputtime%3600/60;
            int second = inputtime%3600%60;
            System.out.println(hour+":"+minute+":"+second);
        }
    }
}