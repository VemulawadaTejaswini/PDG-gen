import java.io.*

public class Main{
    public static void main(String[] args){
        BufferReadered r = new BurfferedReader(new InputStreamReader(System.in), 1);
        int x = Integer.parseInt(r.readLine());
 
        if(0 <= x && x <= 100){
            int cube = x * x * x;
            System.out.println(cube);
        }
    }
}