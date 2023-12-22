import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int n = in.nextInt(); in.nextLine();
        int[] a = new int[w];
        for(int i = 0; i < w; i++){
            a[i] = i + 1;
        }
        for(int i = 0; i < n; i++){
            String[] line = in.nextLine().split(",");
            int s = Integer.parseInt(line[0]) - 1;
            int t = Integer.parseInt(line[1]) - 1;
            int tmp = a[s]; a[s] = a[t]; a[t] = tmp;
        }

        for(int i: a){
            System.out.println(i);
        }
    }
}