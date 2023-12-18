import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<String> valueList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            valueList.add(sc.next());
        }

        List<String> bubbleSortList = bubbleSort(valueList, n);

        if (isStable(valueList, bubbleSortList, n)){
            System.out.println("Stable");
        }else {
            System.out.println("Not stable");
        }

        List<String> selectionSortList = selectionSort(valueList, n);

        if (isStable(valueList, selectionSortList, n)){
            System.out.println("Stable");
        }else {
            System.out.println("Not stable");
        }
    }

    private static int getValue(String valueString){
        return Integer.parseInt(valueString.substring(1,2));
    }

    private static List<String> bubbleSort(List<String> valueList, int n){
        List<String> sortedList = new ArrayList<>(valueList);

        for (int i = 0; i < n; i++){
            for (int j = n-1; j > i; j--){
                if (getValue(sortedList.get(j)) < getValue(sortedList.get(j - 1))){
                    String tempStr = sortedList.get(j);

                    sortedList.set(j, sortedList.get(j-1));
                    sortedList.set(j -1, tempStr);
                }
            }
        }

        System.out.println(String.join(" ", sortedList ));
        return sortedList;
    }

    private static boolean isStable(List<String> in, List<String> out, int n){
        for (int i = 0; i < n; i ++){
            for (int j = i + 1; j < n-1; j ++){
                for (int a=0; a< n; a ++){
                    for (int b = a+1; b < n; b ++){
                        if (getValue(in.get(i)) == getValue(in.get(j)) && in.get(i).equals(out.get(b)) && in.get(j).equals(out.get(a))){
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    private static List<String> selectionSort(List<String> valueList, int n){
        List<String> selectionSortList = new ArrayList<>(valueList);
        for (int i = 0; i < n; i++){
            int minj = i;
            for (int j = i; j < n; j ++){
                if (getValue(selectionSortList.get(j)) < getValue(selectionSortList.get(minj))){
                    minj = j;

                }
            }
            String tempStr = selectionSortList.get(i);
            selectionSortList.set(i, selectionSortList.get(minj));
            selectionSortList.set(minj, tempStr);
        }
        System.out.println(String.join(" ", selectionSortList ));
        return selectionSortList;

    }
}
