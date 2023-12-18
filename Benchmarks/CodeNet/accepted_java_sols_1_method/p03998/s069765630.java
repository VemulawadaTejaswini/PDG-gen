import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Character> alice = in.next().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> bob = in.next().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<Character> charlie = in.next().chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Map<Character, Deque<Character>> players = new HashMap<>();
        players.put('a', new ArrayDeque<>(alice));
        players.put('b', new ArrayDeque<>(bob));
        players.put('c', new ArrayDeque<>(charlie));
        char current = 'a';

        while (true) {
            Deque<Character> characters = players.get(current);
            if (characters.isEmpty()) {
                System.out.println(Character.toUpperCase(current));
                break;
            }
            Character next = characters.pop();
            if (next == current) {
                continue;
            }
            current = next;
        }

    }
}
