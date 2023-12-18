import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()){
            String data[] = sc.nextLine().split(",");
            int number = Integer.parseInt(data[0]);
            double weight = Double.parseDouble(data[1]);
            double height = Double.parseDouble(data[2]);
            double bmi = weight / Math.pow(height, 2);
            if(bmi >= 25){
                System.out.println(data[0]);
                
            }
        }
    }
}
