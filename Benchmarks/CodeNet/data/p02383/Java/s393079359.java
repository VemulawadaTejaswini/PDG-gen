import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] spots = new int[6];
    for (int i = 0; i < 6; i++) {
        spots[i] = sc.nextInt();
    }

    Dice dice = new Main().new Dice(spots);

    String op = sc.next();
    for (char c : op.toCharArray()) {
        switch (c) {
            case 'N': dice = dice.north(); break;
            case 'W': dice = dice.west();  break;
            case 'E': dice = dice.east();  break;
            case 'S': dice = dice.south(); break;
        }
    }

    System.out.println(dice.top());
  }

  class Dice {

    private int[] spots = new int[6];

    public Dice(int[] spots) {
        this.spots = spots;
    }

    public Dice north() {
        return new Dice(new int[]{
            front(),
            bottom(),
            right(),
            left(),
            top(),
            back()
        });
    }

    public Dice west() {
        return new Dice(new int[]{
            right(),
            front(),
            bottom(),
            top(),
            back(),
            left()
        });
    }

    public Dice east() {
        return new Dice(new int[]{
            left(),
            front(),
            top(),
            bottom(),
            back(),
            right()
        });

    }

    public Dice south() {
        return new Dice(new int[]{
            back(),
            top(),
            right(),
            left(),
            bottom(),
            front()
        });
    }

    public int top() {
        return spots[0];
    }

    public int bottom() {
        return spots[5];
    }

    public int front() {
        return spots[1];
    }

    public int back() {
        return spots[4];
    }

    public int left() {
        return spots[3];
    }

    public int right() {
        return spots[2];
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < spots.length; i++) {
            sb.append(i + ": " + spots[i] + ", ");
        }
        sb.append("]");
        return sb.toString();
    }
  }
}
