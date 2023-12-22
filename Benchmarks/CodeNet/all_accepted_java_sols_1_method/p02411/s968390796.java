import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] ar = br.readLine().split(" ");
            int x = Integer.parseInt(ar[0]);
            int y = Integer.parseInt(ar[1]);
            int z = Integer.parseInt(ar[2]);
            if(x == -1 && y == -1 && z == -1){
                break;
            }else if(x == -1 || y == -1 || x+y < 30){
                System.out.println("F");
            }else if(x+y >= 80){
                System.out.println("A");
            }else if(x+y >= 65 && x+y < 80){
                System.out.println("B");
            }else if(x+y >= 50 && x+y < 65 || z >= 50){
                System.out.println("C");
            }else{
                System.out.println("D");
            }
        }
    }
}