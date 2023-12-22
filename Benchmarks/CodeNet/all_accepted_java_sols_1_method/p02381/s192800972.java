import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double student, avr, a;
        String tmp[];
        Double scores[] = new Double[1000];
        try {
            while ((student = Double.parseDouble(br.readLine())) != 0) {
                avr = 0.0;
                a = 0.0;
                tmp = br.readLine().split(" ");
                for (int i = 0; i < student; i++) {
                    scores[i] = Double.parseDouble(tmp[i]);
                    avr += scores[i];
                }

                avr /= student;

                for (int i = 0; i < student; i++) {
                    a += (Math.pow(avr - scores[i], 2));
                }
                System.out.println(Math.sqrt(a / student));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
