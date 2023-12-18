import java.util.*;

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int o = 0;
        int ab = 0;

        while(sc.hasNext()) {
            String[] line = sc.nextLine().split(",");
            if(line[1].equals("A")) {
                a += 1;
            } else if (line[1].equals("B")) {
                b += 1;
            } else if (line[1].equals("O")) {
                o += 1;
            } else if (line[1].equals("AB")) {
                ab += 1;
            }
           
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(ab);
        System.out.println(o);

    }
}