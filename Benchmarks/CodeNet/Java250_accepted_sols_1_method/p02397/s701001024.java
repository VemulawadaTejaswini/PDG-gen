import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int intx, inty;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] str = sc.nextLine().split(" ");
            intx = Integer.parseInt(str[0]);
            inty = Integer.parseInt(str[1]);

            if( intx == 0 && inty == 0) break;
            else if(intx < inty) System.out.println(intx + " " + inty);
            else System.out.println(inty + " " + intx);
        }
        sc.close();
    }
}