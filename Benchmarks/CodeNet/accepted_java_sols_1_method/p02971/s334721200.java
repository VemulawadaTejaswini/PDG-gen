import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());

        List<Integer> listA = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            listA.add(Integer.parseInt(scanner.next()));
        }
        ArrayList<Integer> listB = new ArrayList<>(listA);
        Collections.sort(listB);

        int max = listB.get(listB.size()-1);
        int max2 = listB.get(listB.size()-2);

        for(int i = 0; i< listA.size(); i++) {
            if(max != listA.get(i)) {
                System.out.println(max);
            } else {
                System.out.println(max2);
            }
        }

    }
}
