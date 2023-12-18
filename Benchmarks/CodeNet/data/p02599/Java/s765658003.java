// Part of OpenGenus
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static int getDistinctElements(int[] arr, int i, int j){
        Set<Integer> set = new HashSet<>();

        for(; i<=j; i++)
            set.add(arr[i]);

        return set.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ff = scanner.nextLine();
        String[] bb =  ff.split(" ");
        int t = Integer.valueOf(bb[1]);

        String s = scanner.nextLine();
        String[] a =  s.split(" ");
        int[] arr = new int[a.length];
        for(int i = 0; i < arr.length;  i++)
            arr[i] = Integer.valueOf(a[i]);

        while(t-- != 0){
            String range = scanner.nextLine();
            String[] r = range.split(" ");
            System.out.println(getDistinctElements(arr, Integer.valueOf(r[0])-1, Integer.valueOf(r[1])-1));
        }
    }
}
