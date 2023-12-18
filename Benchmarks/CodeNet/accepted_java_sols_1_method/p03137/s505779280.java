import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String[] data = input1.split(" ");

        int pebbles = Integer.valueOf(data[0]);
        int indexesCount = Integer.valueOf(data[1]);

        if(pebbles>=indexesCount) {
            System.out.println(0);
            return;
        }

        ArrayList<Integer> indexes = new ArrayList<>();
        ArrayList<Integer> diffs = new ArrayList<>();
        String[] indexesString = input2.split(" ");

        for(String input: indexesString) {
            indexes.add(Integer.valueOf(input));
        }

        Collections.sort(indexes);
        Iterator<Integer> integerIterator = indexes.iterator();
        int lastNumber = integerIterator.next();
        while(integerIterator.hasNext()) {
            int nextNumber = integerIterator.next();
            diffs.add(nextNumber-lastNumber);
            lastNumber = nextNumber;
        }

        Collections.sort(diffs);
        Collections.reverse(diffs);

        Iterator<Integer> integerDiffIterator = diffs.iterator();
        int removeHigh = pebbles-1;

        while(removeHigh>0)
        {
            integerDiffIterator.next();
            removeHigh--;
        }
        int sum = 0;
        while(integerDiffIterator.hasNext()) {
           sum =  sum + integerDiffIterator.next();
        }
        System.out.println(sum);

    }
}
