import java.util.Scanner;

class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int s = val % 3600 % 60;
        int m = val % 3600 / 60 ;
        int h = val / 3600;
        System.out.println(h + ":" + m + ":" + s);
    }
}
