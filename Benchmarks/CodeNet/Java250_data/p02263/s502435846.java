import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        new Main().solve();
    }

    private Scanner sc;

    private void solve() {
        sc = new Scanner(System.in);
        String f = sc.nextLine();
        String[] arr = f.split(" ");
        MyStack stack = new MyStack();
        for (String s : arr) {
            try {
                int n = Integer.parseInt(s);
                stack.push(n);
            } catch (Exception e) {
                int n1 = (int) stack.pop();
                int n2 = (int) stack.pop();
                stack.push(calc(n1, n2, s));
            }
        }
        System.out.println(stack.pop());
    }

    private int calc(int n1, int n2, String o) {
        if ("+".equals(o)) {
            return n2 + n1;
        } else if ("-".equals(o)) {
            return n2 - n1;
        } else {
            return n2 * n1;
        }
    }

}

class MyStack {
    int tail;
    Object[] arr;

    public MyStack() {
        this.tail = -1;
        arr = new Object[100];
    }

    public void push(Object o) {
        tail++;
        arr[tail] = o;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            Object r = arr[tail];
            arr[tail] = null;
            tail--;
            return r;
        }
    }

    public boolean isEmpty() {
        if (tail == -1) {
            return true;
        } else {
            return false;
        }
    }

}