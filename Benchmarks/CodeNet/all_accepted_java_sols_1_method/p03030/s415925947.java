import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<String> cities = new ArrayList<String>();
        List<Integer> scores = new ArrayList<Integer>();
        List<String> cityList = new ArrayList<String>();
        List<Integer> sortList;
        List<Integer> ansList = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {
            cities.add(sc.next());
            scores.add(sc.nextInt());
            if (!cityList.contains(cities.get(i))) {
                cityList.add(cities.get(i));
            }
        }

        Collections.sort(cityList);

        int maxIndex, tmp;
        for (String c : cityList) {
            sortList = new ArrayList<Integer>();
            for (int i = 0; i < cities.size(); i++) {
                if (cities.get(i).equals(c)) {
                    sortList.add(i);
                }
            }

            for (int i = 0; i < sortList.size() - 1; i++) {
                maxIndex = i;
                for (int j = i + 1; j < sortList.size(); j++) {
                    if (scores.get(sortList.get(maxIndex)) < scores.get(sortList.get(j))) {
                        maxIndex = j;
                    }
                }
                tmp = sortList.get(i);
                sortList.set(i, sortList.get(maxIndex));
                sortList.set(maxIndex, tmp);
            }
            ansList.addAll(sortList);

        }

        for (Integer ans : ansList) {
            System.out.println(ans + 1);
        }
    }
}