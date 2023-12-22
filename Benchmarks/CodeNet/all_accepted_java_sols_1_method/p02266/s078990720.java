import java.io.*;
import java.util.Stack;
 
class Main{
    // -1 : '\' -2: '_' 
 
    public static void main(String[] args) {
        int MAX = 10000;
 
        int[] squareOfEachSection = new int[MAX]; 
 
        int totalSquare = 0;
 
        for (int i = 0; i < squareOfEachSection.length; i++ ){
            squareOfEachSection[i] = 0;
        }
 
        // try(BufferedReader reader = new BufferedReader(new FileReader("ALDS1_3_D-in41.txt")))
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
             
            String inputString = reader.readLine();
 
            Stack<Integer> stack = new Stack<>();
 
            int sectionIdentifier = 0;
 
            int numOfBackSlashInStack = 0;
 
            for (int i = 0; i < inputString.length(); i++) {
                char currChar = inputString.charAt(i);
 
                if (currChar != '/'){
                    if (currChar == '\\'){
                        numOfBackSlashInStack ++;
                        stack.push(-1);
                    }else {
                        // '_'
                        stack.push(-2);
                    }
                     
                }else {
                    if (numOfBackSlashInStack > 0) {
                         
                        numOfBackSlashInStack --;
                        // If we are in new section, should increment "sectionIAmIn" by 1
                        boolean isInNewSection = true; 
                        int minSectionId = MAX;
                        // squareOfWaterInthisSection = numGotPop; 
                        // Example : \__/  , 3 item '_' '_' '\' got pop, it is 3. 
                        // '\'+'/' = 1, 0.5 per each. else weight 1. 
                        int numGotPop = 0;
                        int itemPop = -5; // -5 has not special meaning
 
                        // pop items out of stack until we hit "\"
                        do{
                            itemPop = stack.pop();
                            numGotPop ++;
                            if (itemPop > 0){
                                minSectionId = minSectionId > itemPop ? itemPop : minSectionId;
                                isInNewSection = false;
                            }
 
                            // while itempop is not -1 ('\')
                        }while(itemPop != -1 );
 
                        if (isInNewSection) {
                                sectionIdentifier += 1;
                             
                            squareOfEachSection[sectionIdentifier] += numGotPop;
                            totalSquare += numGotPop;
 
                            for (int j = 0; j <= numGotPop; j++) {
                                stack.push(sectionIdentifier);
                            }
                        }else {
                            if (minSectionId < sectionIdentifier){
 
                                for (int j = minSectionId + 1; j <= sectionIdentifier; j++){
                                    squareOfEachSection[minSectionId] += squareOfEachSection[j];
                                    squareOfEachSection[j] = 0;
                                }
 
                                sectionIdentifier = minSectionId;
                            }
 
                            squareOfEachSection[sectionIdentifier] += numGotPop;
                            totalSquare += numGotPop;
 
                            for (int j = 0; j <= numGotPop; j++) {
                                    stack.push(sectionIdentifier);
                                 
                            }
                        }
 
 
 
                    } 
                } 
            } // end for
 
            System.out.println(totalSquare+"");
            System.out.print(sectionIdentifier+"");
             
            for (int i = 1; i <= sectionIdentifier; i++){
                System.out.print(" "+squareOfEachSection[i]);
            }
            System.out.println();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
 
    }
}