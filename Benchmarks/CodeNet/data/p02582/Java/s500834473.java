
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int count = 0;
        for(int i=0;i<3;i++){
            if(c[i] == 'R' && (i == 0 || c[i-1] == 'R')){
                count++;
            }
        }
        System.out.println(count);
    }
}
