import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan = new Scanner(System.in);
        Integer numSize = scan.nextInt();
        List<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < numSize; i++) {
            array.add(scan.nextInt());
        }
        int numOfAnswer = 0;
        
        for(int i = 0; i < numSize - 2; i ++) {
            if(array.get(i) < array.get(i + 1) && array.get(i + 1) < array.get(i + 2) || array.get(i) > array.get(i + 1) && array.get(i + 1) > array.get(i + 2)) {
                numOfAnswer++;
            }
        }
        System.out.println(numOfAnswer);
    }
}
