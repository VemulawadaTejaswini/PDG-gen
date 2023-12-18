public class Main {
    public static void main(String[] args) {

         java.util.Scanner sc = new java.util.Scanner(System.in);

         int number[] = new int[6];
        dice d1 = new dice();
        for (int i = 0; i < 6; i ++) { d1.number[i] = sc.nextInt(); }

         d1.command = sc.next();
        for (int i = 0; i < d1.command.length(); i ++) {
            if (d1.command.charAt(i) == ('N')) { d1.toNorth(); }
            if (d1.command.charAt(i) == ('S')) { d1.toSouth(); }
            if (d1.command.charAt(i) == ('W')) { d1.toWest(); }
            if (d1.command.charAt(i) == ('E')) { d1.toEast(); }
        }
        System.out.println(d1.number[0]);
    }
}

class dice {
    int number[] = new int[6];
    String command;

     public void toNorth() {
        int buf = number[5];
        number[5] = number[4];
        number[4] = number[0];
        number[0] = number[1];
        number[1] = buf;
    }
    public void toSouth() {
        int buf = number[5];
        number[5] = number[1];
        number[1] = number[0];
        number[0] = number[4];
        number[4] = buf;
    }
    public void toWest() {
        int buf = number[5];
        number[5] = number[3];
        number[3] = number[0];
        number[0] = number[2];
        number[2] = buf;
    }
    public void toEast() {
        int buf = number[5];
        number[5] = number[2];
        number[2] = number[0];
        number[0] = number[3];
        number[3] = buf;
    }
}