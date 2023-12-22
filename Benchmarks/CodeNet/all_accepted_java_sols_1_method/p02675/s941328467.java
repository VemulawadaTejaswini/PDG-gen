import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import static java.lang.System.in;

class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(reader.readLine());
        switch(N%10){
            case 2:
                System.out.println("hon");
                break;
            case 4:
                System.out.println("hon");
                break;
            case 5:
                System.out.println("hon");
                break;
            case 7:
                System.out.println("hon");
                break;
            case 9:
                System.out.println("hon");
                break;
            case 0:
                System.out.println("pon");
                break;
            case 1:
                System.out.println("pon");
                break;
            case 6:
                System.out.println("pon");
                break;
            case 8:
                System.out.println("pon");
                break;
            case 3:
                System.out.println("bon");
                break;

        }
    }
}
