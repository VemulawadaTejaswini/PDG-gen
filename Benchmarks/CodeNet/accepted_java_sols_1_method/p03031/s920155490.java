import java.util.*;

public class Main {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> elem[] = new ArrayList[m];

        for (int i=0; i<m; i++){
            int k = sc.nextInt();
            elem[i] = new ArrayList<>();
            for (int j=0; j<k; j++){
                elem[i].add(sc.nextInt()-1);
            }
            }

        int p[] = new int[m];
        for (int i=0; i<m; i++) p[i] = sc.nextInt();

        int pattern = 0;

        for (int mask=0; mask<(1<<n); mask++){
            boolean light = true;
            for (int i=0; i<m; i++){
                int count_on = 0;
                for (int j: elem[i]){
                    if ((mask & (1<<j)) != 0){
                        count_on++;
                    }
                }
                if (count_on%2 != p[i]) light = false;
            }
            if (light) pattern++;
        }

        System.out.println(pattern);

        }

    }
