import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean color[] = new boolean[8];
        Arrays.fill(color, false);
        int rainbow = 0;
        int min = 0;
        int N = s.nextInt();
        for(int i = 0; i < N; i++){
            try{
                int rate = s.nextInt();
                if(!color[rate / 400]){
                    min++;
                    color[rate / 400] = true;
                }
            } catch(IndexOutOfBoundsException e){
                rainbow++;
            }
        }
        if(min == 0){
            min = 1;
            rainbow--;
        }
        System.out.println(min + " " + (min+rainbow)); //好きな色ってほんとに好きな色なのかよshit!!
    }
}
