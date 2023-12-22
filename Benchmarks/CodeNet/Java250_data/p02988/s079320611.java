import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        String line1 = sc.nextLine();
        String[] line2 = line1.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)
        ary[i] = Integer.parseInt(line2[i]);
        int count = 0;
        for(int i = 0; i < n - 2; i++){
            if(ary[i] < ary[i + 1]){
                if(ary[i + 1] < ary[i + 2])
                count++;
            }
            else if(ary[i] > ary[i + 1]){
                if(ary[i + 1] > ary[i + 2])
                count++;
            }
        }
        System.out.println(count);
    }
}