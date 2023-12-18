import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        String[] line = reader.readLine().split(" ");
        int[] num = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            num[i] = Integer.parseInt(line[i]);
        }

        for (int i = 0; i < num.length - 1; i++) {
            int minValue = num[i];
            int minIndex = i;
            for (int j = i + 1; j < num.length; j++) {
                if (minValue > num[j]) {
                    minValue = num[j];
                    minIndex = j;
                }
                int w = num[i];
                num[i] = num[minIndex];
                num[minIndex] = w;
            }
        }
        System.out.println(num[0] + " " + num[1] + " " + num[2]);
    }
}