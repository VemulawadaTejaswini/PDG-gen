import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Set<Integer>> list = new TreeMap<>();
        while (sc.hasNext()) {
            String word = sc.next();
            int number = sc.nextInt();

            if(list.containsKey(word)) {
                list.get(word).add(number);
            }else {
                list.put(word, new TreeSet<Integer>(Arrays.asList(number)));
            }
        }
        list.entrySet().stream().map(e->e.getKey()+"\n"+e.getValue().stream().map(Object::toString).collect(Collectors.joining(" "))).
        forEach(System.out::println);
    }
}

