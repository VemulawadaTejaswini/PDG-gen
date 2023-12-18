import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        List<Deque<String>> stacks = new ArrayList<Deque<String>>();

        Scanner scan = new Scanner(System.in);

        int nStacks = scan.nextInt();
        for (int i = 0; i < nStacks; i++) {
            stacks.add(new ArrayDeque<String>());
        }

        while (true) {
            String instruction = scan.next();
            String block;
            int src, dst;

            switch (instruction) {
            case "quit":
                return;

            case "push":
                dst   = scan.nextInt() - 1;
                block = scan.next();
                stacks.get(dst).push(block);
                break;

            case "pop":
                src   = scan.nextInt() - 1;
                block = stacks.get(src).pop();
                System.out.println(block);
                break;

            case "move":
                src   = scan.nextInt() - 1;
                dst   = scan.nextInt() - 1;
                block = stacks.get(src).pop();
                stacks.get(dst).push(block);
                break;
            }
        }
    }
}