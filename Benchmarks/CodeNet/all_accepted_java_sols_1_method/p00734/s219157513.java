import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by S64 on 15/07/28.
 */

// ?????????2??????32???36?§????

class Main {

    public static void main(String _[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String[] counts = in.readLine().split(" ");

            int taro = Integer.parseInt(counts[0]);
            int hanako = Integer.parseInt(counts[1]);

            if(taro+hanako < 1)
                break;

            int[] taroCards = new int[taro];
            int[] hanakoCards = new int[hanako];

            for(int i = 0; i < taro; i++)
                taroCards[i] = Integer.parseInt(in.readLine());
            for(int i = 0; i < hanako; i++)
                hanakoCards[i] = Integer.parseInt(in.readLine());

            ArrayList<int[]> results = new ArrayList<int[]>();

            for(int taroKey = 0 ; taroKey < taroCards.length ; taroKey++) {
                int taroCard = taroCards[taroKey];
                for(int hanakoKey = 0 ; hanakoKey < hanakoCards.length; hanakoKey++) {
                    int hanakoCard = hanakoCards[hanakoKey];
                    int taroPoint = 0;
                    int hanakoPoint = 0;
                    {
                        for(int i = 0;i<taroCards.length;i++)
                            taroPoint += (i == taroKey) ? hanakoCards[hanakoKey] : taroCards[i];
                        for(int i = 0;i<hanakoCards.length;i++)
                            hanakoPoint += (i == hanakoKey) ? taroCards[taroKey] : hanakoCards[i];
                    }
                    {
                        if(taroPoint != hanakoPoint)
                            continue;
                        results.add( new int[] {taroCard, hanakoCard} );
                    }
                }
            }
            {
                int[] result = new int[] {0, 0};
                for(int[] v : results) {
                    int old = result[0] + result[1];
                    if(old == 0 || old > v[0] + v[1])
                        result = new int[] { v[0], v[1] };
                }
                if(result[0]+result[1] == 0)
                    System.out.println("-1");
                else
                    System.out.println( String.format("%d %d", result[0], result[1]) );
            }
        }
    }

}