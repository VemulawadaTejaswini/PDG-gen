import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            String order = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(order.equals("replace")) {
                String p = sc.next();
                str = str.substring(0, a) + p + str.substring(b+1);
            }else if(order.equals("reverse")){
                StringBuffer sb = new StringBuffer(str.substring(a, b+1));
                str = str.substring(0, a) + (sb.reverse()).toString() + str.substring(b+1);
            }else{
                System.out.println(str.substring(a, b+1));
            }

        }
    }
}
