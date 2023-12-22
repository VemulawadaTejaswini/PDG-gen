import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardNum = Integer.parseInt(sc.next());
        int gateNum = Integer.parseInt(sc.next());
        int min = 0;
        int max = 0;

        min = Integer.parseInt(sc.next());
        max = Integer.parseInt(sc.next());

        for(int gtn = 1; gtn < gateNum; gtn++){
            int mint = Integer.parseInt(sc.next());
            if(min < mint) min = mint;
            int maxt = Integer.parseInt(sc.next());
            if(max > maxt) max = maxt;
        }

        int counter = 0;
        for(int i = 1; i <= cardNum; i++) {
            if(i >= min && i <= max) counter++;
        }
        System.out.println(counter);
    }
}