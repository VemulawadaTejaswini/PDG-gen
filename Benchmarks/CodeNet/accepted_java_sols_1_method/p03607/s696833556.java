
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner Input = new Scanner(System.in);
        int N = Input.nextInt();
        HashMap<String, Integer> HM = new HashMap();
        Iterator IT = HM.entrySet().iterator();
        for (int I = 0; I < N; I++) {
            String S = Input.next();
            if (!HM.containsKey(S)) {
                HM.put(S, 1);
            } else {
                HM.replace(S, HM.get(S) + 1);
            }
        }
        int C = 0;
        for (int Values : HM.values()) {
            if (Values % 2 == 1) {
                C++;
            }
        }
        System.out.println(C);
    }
}
