import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] step = sc.next().toCharArray();
        boolean b = true;
        for(int i=0; i<step.length; i++){
            if((i%2==0 && step[i]=='L')||(i%2==1 && step[i]=='R')){
                b = false;
                break;
            }
        }
        System.out.println(b ? "Yes" : "No");
    }
}