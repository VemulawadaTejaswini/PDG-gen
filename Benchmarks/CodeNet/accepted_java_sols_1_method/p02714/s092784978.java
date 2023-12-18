
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String  s = sc.next();
        char[] rgb = s.toCharArray();
        long countR = 0;
        long countB = 0;
        long countG = 0;
        for (int i = 0; i < rgb.length; i++){
            if('R' == rgb[i])
                countR++;
            if ('B' == rgb[i])
                countB++;
            if ('G' == rgb[i])
                countG++;
        }
        long result = countB * countG * countR;
        long ng = 0;
        for (int i = 0; i < n - 2; i++){
            for (int j = i + 1; j < n - 1; j++){
                if (rgb[i] == rgb[j]){
                    continue;
                }
                int diff = j - i;
                if (j + diff < n && rgb[j + diff] != rgb[i] && rgb[j + diff] != rgb[j])
                    ng++;
            }
        }
        System.out.println(result - ng);

    }
}
