import java.util.*;

class Stack<E> {
    E[] arr;
    int top;
    int MAX;

    public Stack(int max) {
        this.MAX = max;
        arr = (E[]) new Object[max];
    }

    void initialize() {
        top = 0;
    }

    boolean isEmpty() {
        return top == 0;
    }

    boolean isFull() {
        return top >= MAX - 1;
    }

    void push(E x) {
        if (isFull()) {
            throw new RuntimeException("オーバーフロー");
        }
        top++;
        arr[this.top] = x;
    }

    E pop() {
        if (isEmpty()) {
            throw new RuntimeException("アンダーフロー");
        }
        top--;
        return arr[this.top + 1];
    }
}

public class ALDS1_3_A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>(200);
        stack.initialize();

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                stack.push(sc.nextInt());
            } else {
                String s = sc.next();
                int res;
                if (s.equals("+")) {
                    res = stack.pop() + stack.pop();
                } else if (s.equals("-")) {
                    res = - stack.pop() + stack.pop();
                } else if (s.equals("*")) {
                    res = stack.pop() * stack.pop();
                } else {
                    throw new RuntimeException("hoge");
                }
                stack.push(res);
            }
        }

        System.out.println(stack.pop());
    }
}

