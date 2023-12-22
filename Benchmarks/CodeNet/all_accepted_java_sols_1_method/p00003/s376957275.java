import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        for( int i = 0; i < inputCount; i++) {
            String line = br.readLine();
            List<Integer> sideLengthList = new ArrayList<>();
            for( String s : line.split(" ")  ) {
                sideLengthList.add( Integer.parseInt(s) );
            }
            Collections.sort(sideLengthList, Collections.reverseOrder());
            int cSide = sideLengthList.get(0);
            int aSide = sideLengthList.get(1);
            int bSide = sideLengthList.get(2);
            if( cSide * cSide == aSide * aSide + bSide * bSide) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

