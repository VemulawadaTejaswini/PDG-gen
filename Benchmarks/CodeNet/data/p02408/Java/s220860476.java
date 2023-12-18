import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashMap<String, Integer> hashmap = new HashMap<>();
        hashmap.put("S", 0);
        hashmap.put("H", 1);
        hashmap.put("C", 2);
        hashmap.put("D", 3);
        boolean[][] cards = new boolean[4][13];
        for (int i = 0; i < n; i++) {
            String design = sc.next();
            int num = Integer.parseInt(sc.next());
            cards[hashmap.get(design)][num - 1] = true;
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (!cards[i][j]) {
                    String x = "";
                    switch(i) {
                        case 0: x = "S"; break;
                        case 1: x = "H"; break;
                        case 2: x = "C"; break;
                        case 3: x = "D"; break;
                    }
                    System.out.println(x + " " + (j + 1));   
                }
            }
        }
    }
}

