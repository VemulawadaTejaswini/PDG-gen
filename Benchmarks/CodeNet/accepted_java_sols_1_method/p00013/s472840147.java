import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> StoppingTrain = new ArrayList<>();
        ArrayList<Integer> GoTrain = new ArrayList<>();
        int train = 0;
        int listEndIndex = 0;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        try {
            while ((line = input.readLine()) != null) {
                train = Integer.parseInt(line);
                if (train == 0) { //departure train
                    listEndIndex = StoppingTrain.size() - 1;
                    train = StoppingTrain.get(listEndIndex);
                    StoppingTrain.remove(listEndIndex);
                    GoTrain.add(train);
                } else {
                    StoppingTrain.add(train);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println(line + "is not Int");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        for(int i = 0; i < GoTrain.size(); i++){
            System.out.println(GoTrain.get(i));
        }
    }
}
