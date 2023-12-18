public class Main {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        dice d1 = new dice();
        for (int i = 0; i < 6; i ++) { d1.number[i] = sc.nextInt(); }

        int q = sc.nextInt();
        for (int i = 0; i < q; i ++) { d1.getRight(sc.nextInt(), sc.nextInt()); }
    }
}

class dice {
    int number[]  = new int[6];

     public void getRight(int top, int front) {

         int right = - 1;
        if (top == number[3] && front == number[1] || top == number[1] && front == number[2]
            || top == number[2] && front == number[4] || top == number[4] && front == number[3]) { right = 0; }
        else if (top == number[3] && front == number[5] || top == number[5] && front == number[2]
            || top == number[2] && front == number[0] || top == number[0] && front == number[3]) { right = 1; }
        else if (top == number[4] && front == number[0] || top == number[0] && front == number[1]
            || top == number[1] && front == number[5] || top == number[5] && front == number[4]) { right = 2; }
        else if (top == number[0] && front == number[4] || top == number[4] && front == number[5]
            || top == number[5] && front == number[1] || top == number[1] && front == number[0]) { right = 3; }
        else if (top == number[2] && front == number[5] || top == number[5] && front == number[3]
            || top == number[3] && front == number[0] || top == number[0] && front == number[2]) { right = 4; }
        else if (top == number[1] && front == number[3] || top == number[3] && front == number[4]
            || top == number[4] && front == number[2] || top == number[2] && front == number[1]) { right = 5; }
        System.out.println(number[right]);
    }
}