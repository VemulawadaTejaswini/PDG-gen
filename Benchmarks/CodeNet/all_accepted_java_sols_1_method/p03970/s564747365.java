import java.util.Scanner;

/**
 * Created by yufeng.fyf on 16/10/10.
 */
public class Main {
    private static String temple = "CODEFESTIVAL2016";
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int n = 0;
        for(int i=0;i<16;i++){
            if(s.charAt(i)!=temple.charAt(i)){
                n++;
            }
        }
        System.out.println(n);
    }
}
