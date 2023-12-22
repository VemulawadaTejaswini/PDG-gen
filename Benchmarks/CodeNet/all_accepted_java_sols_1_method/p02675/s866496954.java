import java.util.Scanner;

public class Main {

    public Main(){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());

        switch (N%10){
            case 0:
            case 1:
            case 6:
            case 8:
                System.out.println("pon");
                break;
            case 3:
                System.out.println("bon");
                break;
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
                System.out.println("hon");
                break;
        }
    }

    public static void main(String[] args) {
        Main M = new Main();
    }
}
