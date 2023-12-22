import java.util.*;
public class Main {

    public static void main(String[] args) {
        //try {
          //  File inputFile = new File("src/ITP1/dataSetPTC.txt");
            Scanner scan = new Scanner(System.in);
            String caseStr = "Case ";
            String colonStr = ": ";
            int line = 1;
            while (scan.hasNext()) {
                int inputNum = scan.nextInt();
                if(inputNum == 0) {
                    break;
                }
                System.out.println(caseStr + line + colonStr + inputNum);
                line ++;
            }
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
       // }
    }
}