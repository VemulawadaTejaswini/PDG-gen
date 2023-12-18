import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Double> arD = new ArrayList<>();
        
        while(in.hasNextDouble()){
            arD.add(in.nextDouble());
        }
        
        Collections.sort(arD);
        
        System.out.println(arD.get(arD.size() - 1) - arD.get(0));
    }
}

