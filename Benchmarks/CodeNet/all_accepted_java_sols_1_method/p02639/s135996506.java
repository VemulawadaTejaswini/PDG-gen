import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int n[] = new int[5];
        for (byte i=0; i<5; i++){
            n[i] = yomi.nextInt();
        }
        for (byte i=0; i<5; i++){
            if(n[i] == 0){
                System.out.println(i+1);
                break;
            }
        }
        }

}