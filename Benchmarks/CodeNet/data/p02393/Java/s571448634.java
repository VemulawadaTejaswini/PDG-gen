import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        list.add(sc.nextInt());
        List<Integer> arr = quickSort(list);
        System.out.printf("%d %d %d\n", arr.get(0), arr.get(1), arr.get(2));
    }
    static List<Integer> quickSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }
        int p = list.get(0);
        List<Integer> result = new ArrayList<Integer>();
        List<List<Integer>> divided = divide(p, list.subList(1, list.size()));
        result.addAll(quickSort(divided.get(0)));
        result.add(p);
        result.addAll(quickSort(divided.get(1)));
        return result;
    }
    static List<List<Integer>> divide(int p, List<Integer> list) {
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0; i<list.size(); i++){
            if (p > list.get(i)) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }
        result.add(left);
        result.add(right);
        return result;
    }
}
