import java.util.Scanner;

class Main {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int balls = scanner.nextInt();
        int persons = scanner.nextInt();
        int temp = persons;
        while (temp-- > 0) {
            balls--;
        }

        if (balls > persons)
            System.out.println(0);
        else
            System.out.println(balls);
        //System.out.println("balls : " + balls + " Persons : " + persons);
    }
}
