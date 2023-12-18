import java.util.*;
public class Main {
    public static void main(String[] args) {
        int no1 = 0;
        int no2 = 0;
        int no3 = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            String line = sc.nextLine();
            int h = Integer.parseInt(line);
            if(h > no1) {
                int a = no1;
                int b = no2;
                no2 = a;
                no3 = b;
                no1 = h;
                continue;
            }else if(h > no2) {
                no3 = no2;
                no2 = h;
                continue;
            }else if(h > no3) {
                no3 = h;
                continue;
            }
        }
        System.out.println(no1);
        System.out.println(no2);
        System.out.println(no3);
     
    }
 } 
