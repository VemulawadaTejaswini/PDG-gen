
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int count = 0;
        for(int i=0;i<3;i++){
            if(c[i] == 'R'){
                count++;
            }
        }
        if(count == 2 && c[1] != 'R'){
            count = 1;
        }
        System.out.println(count);
    }
}
