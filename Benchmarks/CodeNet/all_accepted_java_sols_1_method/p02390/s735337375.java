import java.util.Scanner; 

class Main {

    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        int seconds = Integer.parseInt(scan.next());
        System.out.println(String.format(seconds / 3600 + ":" + seconds % 3600 / 60 + ":" + seconds % 60));
    }
}


