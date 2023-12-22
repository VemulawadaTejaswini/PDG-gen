import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)  ary[i] = Integer.parseInt(line1[i]);
        int[] ary1 = ary.clone();
        Arrays.sort(ary1);
        int count = 0;
        for(int i = 0; i < ary.length; i++) if(ary[i] != ary1[i])   count++;
        if(count == 2 || count == 0)  System.out.println("YES");
        else    System.out.println("NO");
    }
}