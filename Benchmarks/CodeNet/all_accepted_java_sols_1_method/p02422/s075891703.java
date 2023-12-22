import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //strline
        String strline = sc.nextLine();
        //str[]
        String[] str = strline.split("");
        //n
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        //n回繰り返し
        for(int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            String[] line1sp = line1.split(" ");
            String order = line1sp[0];
            int a = Integer.parseInt(line1sp[1]);
            int b = Integer.parseInt(line1sp[2]);
            String p;
            
            if(order.equals("print")) {
                for(int j = a; j <= b; j++) {
                    System.out.print(str[j]);
                    if(j == b) {
                        System.out.println("");
                    }
                }
            }
        
            if(order.equals("reverse")) {
                String[] dainyu = new String[b-a+1];
                for(int j = 0; j <= b-a; j++) {
                    dainyu[j] = str[b-j];
                }
                for(int j = 0; j <= b-a; j++) {
                    str[a+j] = dainyu[j];
                }
            }
            
            if(order.equals("replace")) {
                p = line1sp[3];
                String[] psp = p.split("");
                for(int j = a; j <= b; j++) {
                    str[j] = psp[j-a];
                }
            }
        }
    }
}

