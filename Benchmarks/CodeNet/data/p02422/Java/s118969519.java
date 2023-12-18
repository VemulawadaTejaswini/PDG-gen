import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();

        StringBuilder sb = new StringBuilder(str);
        for(int i=0; i<q; i++) {
            String order = sc.next();
            int index1 = sc.nextInt();
            int index2 = sc.nextInt();
            if(order.equals("replace")) {
                String target = sc.next();
                sb.replace(index1, index2+1, target);
            } else if(order.equals("reverse")) {
                StringBuilder tmp1 = new StringBuilder(sb.substring(index1, index2+1));
                sb.replace(index1, index2+1, tmp1.reverse().toString());
            } else {
                System.out.println(sb.substring(index1, index2+1));
            }
        }
        sc.close();
    }
}

