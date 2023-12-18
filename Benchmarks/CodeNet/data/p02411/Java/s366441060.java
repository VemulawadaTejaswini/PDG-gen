
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        String[] columns = new String[3];
        final int ZENKI = 0;
        final int KOUKI = 1;
        final int SAITEST = 2;
        int count = 0;
        ArrayList[] scores = new ArrayList[3];

        scores[ZENKI] = new ArrayList();
        scores[KOUKI] = new ArrayList();
        scores[SAITEST] = new ArrayList();

        while (true) {

            String line = reader.readLine();
            columns = line.split(" ");
            if (Integer.parseInt(columns[0]) == -1 
             && Integer.parseInt(columns[1]) == -1
             && Integer.parseInt(columns[2]) == -1){
                break;
            }
            scores[ZENKI].add(Integer.parseInt(columns[ZENKI]));
            scores[KOUKI].add(Integer.parseInt(columns[KOUKI]));
            scores[SAITEST].add(Integer.parseInt(columns[SAITEST]));
            
            count++;
        }
        for (int i = 0; i < count; i++) {
            if ((Integer)scores[ZENKI].get(i) == -1 || (Integer)scores[KOUKI].get(i) == -1 || (Integer)scores[ZENKI].get(i) + (Integer)scores[KOUKI].get(i) < 30) {
                builder.append("F");
            }
            else if (((Integer)scores[ZENKI].get(i) + (Integer)scores[KOUKI].get(i)) >= 80) {
                builder.append("A");
            }
            else if ((Integer)scores[ZENKI].get(i) + (Integer)scores[KOUKI].get(i) < 80 && (Integer)scores[ZENKI].get(i) + (Integer)scores[KOUKI].get(i) >= 65 ) {
                builder.append("B");
            }
            else if ((Integer)scores[ZENKI].get(i) + (Integer)scores[KOUKI].get(i) < 65 && (Integer)scores[ZENKI].get(i) + (Integer)scores[KOUKI].get(i) >= 50 ) {
                builder.append("C");
            }
            else if ((Integer)scores[ZENKI].get(i) + (Integer)scores[KOUKI].get(i) < 50 && (Integer)scores[ZENKI].get(i) + (Integer)scores[KOUKI].get(i) >= 30 ) {
                if ((Integer)scores[SAITEST].get(i) == 50 ) {
                    builder.append("C");
                }
                builder.append("D");
            }
            builder.append("\n");
        }
        System.out.print(builder);
    }
}