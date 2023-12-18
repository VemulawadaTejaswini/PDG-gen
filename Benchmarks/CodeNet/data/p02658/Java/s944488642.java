import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        int num = Integer.parseInt(first);
        String second = sc.nextLine();
        String Array[] = second.split(" ");
        long[] number = new long[num];
        for(int u = 0; u < Array.length; u++){
            number[u] = Long.parseLong(Array[u]);
        }
        long kakeru = 1;
        for (int i = 0; i < Array.length; i++) {
            kakeru = kakeru * number[i];
        }
        if(kakeru > 1_000_000_000_000_000_000L){
            kakeru = -1;
        }
        System.out.println(kakeru);

    }

}
