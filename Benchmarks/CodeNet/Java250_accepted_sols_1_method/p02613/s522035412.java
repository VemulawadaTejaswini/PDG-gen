import java.util.Scanner;

class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int T = scan.nextInt();
        String[] status = {"AC", "WA", "TLE", "RE"};
        int[] count = new int[4];
        while(T != 0) {
            String ans = scan.next();
            if(ans.equals("AC")) {
                count[0] = count[0] + 1 ;
            } else if (ans.equals("WA")) {
                count[1] = count[1] + 1;
            } else if (ans.equals("TLE")) {
                count[2] = count[2] + 1;
            } else if (ans.equals("RE")){
                count[3] = count[3] + 1;
            }
            T--;
        }
        for(int i = 0; i < count.length; i++) {
            System.out.println(status[i] + " x " + count[i]);
        }
    }
}
