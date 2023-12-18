import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
        	int haba = sc.nextInt();
            int menseki = 0;

            for(int i = 0; i * haba < 600; i++){
                menseki += (i * haba) * (i * haba) * haba;
            }

            System.out.println(menseki);
        }
    }
}