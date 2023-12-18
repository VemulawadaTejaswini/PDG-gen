import java.util.*;

class AOJ0034 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String [] line = sc.nextLine().split(",");
            int [] length = new int[10];
            int totalLength = 0;
            for(int i = 0; i < 10; i++) {
                length[i] = Integer.parseInt(line[i]);
                totalLength += length[i];
            }

            int v1 = Integer.parseInt(line[10]);
            int v2 = Integer.parseInt(line[11]);

            double meet = totalLength * 1.0 * v1 / (v1 + v2);

            for(int i = 0; i < 10; i++) {
                if (meet <= length[i]) {
                    System.out.println(i + 1);
                    break;
                } else {
                    meet -= length[i];
                }
            }
        }

    }
}