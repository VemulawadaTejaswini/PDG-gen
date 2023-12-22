import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<3; i++){
            arrayList.add(scanner.nextInt());
        }

        Collections.sort(arrayList, Collections.reverseOrder());

        System.out.println(arrayList.get(0)*10 + arrayList.get(1) + arrayList.get(2));

    }
}