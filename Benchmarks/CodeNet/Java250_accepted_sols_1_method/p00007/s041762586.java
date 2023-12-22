import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            double debt = 100000;
            int x = Integer.parseInt(br.readLine());
            for (int i = 0; i < x ; i++) {
                debt *= 1.05;
                if((long)debt%1000!=0){
                    debt = (((long)debt)/1000+1)*1000;
                }
            }
            System.out.println((long)debt);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}