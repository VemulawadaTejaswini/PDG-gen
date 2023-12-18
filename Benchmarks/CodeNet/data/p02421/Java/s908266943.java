import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, point1 = 0, point2 = 0;
        String card1, card2;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            card1 = sc.next();
            card2 = sc.next();
            if (card2.compareTo(card1) < 0) {
                point1 += 3;
            } else if (card1.equals(card2)) {
                point1++;
                point2++;
            } else {
                point2 +=3;
            }
        }
        System.out.println(point1 + " " + point2);
    }
}
