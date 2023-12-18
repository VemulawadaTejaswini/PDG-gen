import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int hrs = 0;
        int min = 0;

        Scanner sc = new Scanner(System.in);

        int sec = sc.nextInt();

        if (sec < 60) {
            hrs = 0;
            min = 0;
        } else if (sec >= 60 && sec < 60*60) {
            hrs = 0;
            min = sec / 60;
            sec %= 60;
        } else if (sec >= 60*60) {
            hrs = sec / (60*60);
            min = (sec - hrs*60*60) / 60;
            sec = sec - hrs*60*60 - min*60;
        }


        System.out.println(hrs + ":" + min + ":" + sec);

        sc.close();
    }

}
