import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] tairu = S.split("");
        int not01 = 0;
        int not10 = 0;
        for(int i=0; i<tairu.length; i++) {
            if(i % 2 == 0) {
                if(tairu[i].equals("0")) {
                    not10++;
                }else {
                    not01++;
                }
            }else {
                if(tairu[i].equals("1")) {
                    not10++;
                }else {
                    not01++;
                }
            }
        }
        
        if(not10 >= not01) {
            System.out.println(not01);
        }else {
            System.out.println(not10);
        }
    }
}