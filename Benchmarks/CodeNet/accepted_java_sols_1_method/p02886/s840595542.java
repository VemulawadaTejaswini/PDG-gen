import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int[] ary = new int[n];
        for(int i = 0; i < n; i++)  ary[i] = Integer.parseInt(line1[i]);
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                count += ary[i] * ary[j];
            }
        }
        System.out.println(count);
    }
}