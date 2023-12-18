import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> triangle = new ArrayList<Integer>();
        for(int i=0; i<3; i++){
            triangle.add(sc.nextInt());
        }

        if((triangle.get(0)==(triangle.get(1)) && (triangle.get(0)==triangle.get(2)))){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}