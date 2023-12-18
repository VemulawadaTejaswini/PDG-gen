import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

class Stack {
    int top;
    int[] buf;
    int size;

    Stack() {
        top = 0;
        buf = new int[101];
        size = 101;
    }

    boolean isEmpty() {
        return top == 0;
    }

    boolean isFull() {
        return top >= size;
    }

    void push(int x) {
        if (isFull()) {
            throw new IllegalArgumentException("Stack is full");
        }
        top++;
        buf[top] = x;
    }

    int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("Stack is empty");
        }
        top--;
        return buf[top + 1];
    }

    Optional<Integer> peek() {
        return Optional.ofNullable(buf[top]);
    }
}

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            String[] arr = in.readLine().split(" ");
            Stack stack = new Stack();
            for (int i = 0; i < arr.length; i++) {
                String s = arr[i];
                char c = s.charAt(0);
                if (Character.isDigit(c)) {
                    stack.push(Integer.parseInt(s));
                } else {
                    int y = stack.pop();
                    int x = stack.pop();
                    switch (c) {
                        case ('+'):
                            stack.push(x + y);
                            break;
                        case ('-'):
                            stack.push(x - y);
                            break;
                        case ('*'):
                            stack.push(x * y);
                            break;
                        case ('/'):
                            stack.push(x / y);
                            break;
                    }
                }
            }

            System.out.println(stack.pop());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
