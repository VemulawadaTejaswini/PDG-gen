
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            int[] juge = new int[2];
            juge[0] = Integer.parseInt(sc.next());
            juge[1] = Integer.parseInt(sc.next());
            Arrays.sort(juge);
            if(juge[0] == 0 && juge[1] == 0){
                flag = false;
            }else{
                System.out.println(juge[0] + " " + juge[1]);                
            }
        }
    }
}
