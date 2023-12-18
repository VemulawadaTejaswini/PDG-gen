import java.io.IOException;
import java.util.Scanner;
import java.util.PriorityQueue;

class Main {
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String operation;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        StringBuilder sb = new StringBuilder("");
        while (true) {
            operation = sc.nextLine();
            if (operation.charAt(0) == 'i') {
                queue.add(Integer.parseInt(operation.substring(7)) * -1);
            } else if (operation.charAt(1) == 'x') {
                sb.append(queue.poll() * -1);
                sb.append('\n');
            } else {
                break;
            }
        }
        System.out.print(sb);
    }
}