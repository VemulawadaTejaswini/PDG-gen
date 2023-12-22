import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int num;
        num = cin.nextInt();

        String temp;
        HashMap<String, Integer> vote = new HashMap<>();
        for (int i = 0; i < num; i++) {
            temp = cin.next();
            if (vote.containsKey(temp)) {
                vote.put(temp, vote.get(temp) + 1);
            } else {
                vote.put(temp, 1);
            }
        }

        int max = Collections.max(vote.values());

        ArrayList<String> strings = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : vote.entrySet()) {
            if (max == entry.getValue()) {
                strings.add(entry.getKey());
            }
        }

        Collections.sort(strings);

        for (String s: strings) {
            System.out.println(s);
        }
    }
}
