import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //改行
        String a = sc.nextLine();
        
        Integer[] list = new Integer[8];
        
        for(int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] linesp = line.split("");
            for(int j = 0; j < 8; j++) {
                list[j] = Integer.parseInt(linesp[j]);
            }
            Integer max = 0;
            int min = 0;
            Arrays.sort(list);
            int x = 0;
            for(int j = 10000000; j >= 1; j/=10) {
                min += list[x] * j;
                x++;
            }
            Arrays.sort(list, Collections.reverseOrder());
            x = 0;
            for(int j = 10000000; j >= 1; j/=10) {
                max += list[x] * j;
                x++;
            }
            System.out.println(max - min);
        }
    }
}

