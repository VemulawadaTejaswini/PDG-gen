import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
 
public class Main {
    public static void main(String[] args) {
        printAnswer();
    }
 
    private static void printAnswer() {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
 
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            List<Integer> trainList = new ArrayList<>();
            String dataset = br.readLine();
 
            while (dataset != null) {
                int integer = Integer.parseInt(dataset);
                if(integer != 0){
                    trainList.add(integer);
                }else{
                    System.out.println(trainList.get(trainList.size()-1));
                    trainList.remove(trainList.size()-1);
                }
                dataset = br.readLine();
            }
        } catch (IOException e) {
            logger.info("Error:  Reading input data is failed.");
        }
    }
}