import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abc = new int[3];
        abc[0] = Integer.parseInt(sc.next());
        abc[1] = Integer.parseInt(sc.next());
        abc[2] = Integer.parseInt(sc.next());
        int count = 0;
        int dif1 = 0;
        int dif2 = 0;
        if(abc[0] >= abc[1] && abc[0] >= abc[2]) {
            dif1 = abc[0] - abc[1];
            dif2 = abc[0] - abc[2];
        }else if(abc[1] >= abc[0] && abc[1] >= abc[2]) {
            dif1 = abc[1] - abc[0];
            dif2 = abc[1] - abc[2];
        }
        else {
            dif1 = abc[2] - abc[0];
            dif2 = abc[2] - abc[1];
        }
        if(dif1 % 2 == dif2 % 2) {
            if(dif1 % 2 == 0) count = (dif1+dif2)/2;
            else count = (dif1+dif2)/2;
        }else {
            if(dif1 % 2 == 0) count = dif1/2 + (dif2+1)/2 + 1;
            else count = dif2/2 + (dif1+1)/2 + 1;
        }
        System.out.println(count);
    } 
}