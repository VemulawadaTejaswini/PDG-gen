import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int N = Integer.parseInt(reader.readLine());
            List<Integer> numbers = new ArrayList<>();
            for (int i=0; i<N; i++) {
                numbers.add(i, Integer.parseInt(reader.readLine()));
            }
            List<Integer> sortedNums = new ArrayList<>(numbers);
            Collections.sort(sortedNums, Collections.reverseOrder());
            for (int i=0; i<N; i++) {
                if (numbers.get(i) == sortedNums.get(0)) {
                    System.out.println(sortedNums.get(1));
                }
                else {
                    System.out.println(sortedNums.get(0));
                }
            }
            reader.close();
        }
        catch(Exception e) {}
    }
}