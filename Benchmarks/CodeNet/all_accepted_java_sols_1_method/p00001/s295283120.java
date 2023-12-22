import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        ArrayList<Integer> mList = new ArrayList<>();

        while(sc.hasNext()){
            mList.add(sc.nextInt());
        }
        mList.sort(Comparator.reverseOrder());
        for (int i = 0; i < 3; i++) {
            System.out.println(mList.get(i));
        }
    }
}