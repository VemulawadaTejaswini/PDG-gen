import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int q = scn.nextInt();

        for(int i=0;i<q;i++){
            String order = scn.next();
            if(order.equals("print")){
                int a = scn.nextInt();
                int b = scn.nextInt();

                System.out.println(str.substring(a,b+1));
            }
            if(order.equals("reverse")){
                int a = scn.nextInt();
                int b = scn.nextInt();

                StringBuffer reverse = new StringBuffer(str.substring(a,b+1));
                String nre1 = str.substring(0,a);
                String nre2 = str.substring(b+1,str.length());
                String re = reverse.reverse().toString();

                str = nre1 + re + nre2;

            }
            if(order.equals("replace")){
                int a = scn.nextInt();
                int b = scn.nextInt();
                String rep = scn.next();

                String nre1 = str.substring(0,a);
                String nre2 = str.substring(b+1,str.length());

                str = nre1 + rep + nre2;

            }


        }


        scn.close();
    }

}
