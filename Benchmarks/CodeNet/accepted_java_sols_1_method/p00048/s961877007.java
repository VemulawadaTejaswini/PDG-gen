
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            double weight = in.nextDouble();
            String rank;

            if(weight <= 48.00){
                 rank = "light fly";
            }else if(weight > 48.00 && weight <= 51.00){
                rank = "fly";
            }else if(weight > 51.00 && weight <= 54.00){
                rank = "bantam";
            }else if(weight > 54.00 && weight <= 57.00){
                rank = "feather";
            }else if(weight > 57.00 && weight <= 60.00){
                rank = "light";
            }else if(weight > 60.00 && weight <= 64.00){
                rank = "light welter";
            }else if(weight > 64.00 && weight <= 69.00){
                rank = "welter";
            }else if(weight > 69.00 && weight <= 75.00){
                rank = "light middle";
            }else if(weight > 75.00 && weight <= 81.00){
                rank = "middle";
            }else if(weight > 81.00 && weight <= 91.00){
                rank = "light heavy";
            }else{
                rank = "heavy";
            }
            System.out.println(rank);
        }
    }
}

