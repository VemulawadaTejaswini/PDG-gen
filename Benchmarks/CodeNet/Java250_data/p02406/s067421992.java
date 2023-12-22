import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // TODO ??????????????????????????????????????¨?????¨????????????????????????

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String strN = Integer.toString(n);

        if (n >= 3 && n <= 10000) {
            for(int i = 1; i <= n; i++){

                int x = 0;

//              i???3????????°?????´???
                if(i % 3 == 0){
                    System.out.print(" " + i);
//              i???3?????????????????´???
                }else if(i % 10 == 3){
                    System.out.print(" " + i);
                } else if (i / 1000 == 3) {
                    System.out.print(" " + i);
                } else if ((x = i % 1000) / 100 == 3) {
                    System.out.print(" " + i);
                } else if ((x = x % 100) / 10 == 3) {
                    System.out.print(" " + i);
                }
            }
        }
        System.out.println();
    }
}