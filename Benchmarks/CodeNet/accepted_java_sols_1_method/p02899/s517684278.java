import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)  ary[i] = Integer.parseInt(line1[i]);
        int[] ary1 = new int[n];
        for(int i = 0; i < n; i++)  ary1[ary[i] - 1] = i + 1;
        for(int i = 0; i < n; i++)  System.out.print(ary1[i] + " ");
    }
}