import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Main mo = new Main();
        
        ArrayList<String> dataSet = new ArrayList<String>();
        mo.inputDataSet(dataSet, "0");
        
        for(int i = 0;i < dataSet.size();i++){
            int n = Integer.parseInt(dataSet.get(i));
            RemoveUnluckyNumber run = new RemoveUnluckyNumber(n);
            run.showConvNum();
        }
    }
    
    public static void inputDataSet(ArrayList<String> dataSet, String terminal) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            String line = br.readLine();
            if(line.equals(terminal))break;
            dataSet.add(line);
        }
    }
}

class RemoveUnluckyNumber{
    private int n;
    
    public RemoveUnluckyNumber(int n){
        this.n = n;
    }
    
    public int extrOctalDigit(int decimalNum, int d){
        return (decimalNum >> 3 * (d - 1)) & 7;
    }
    
    public int singleDigitConv(int val){
        int convVal = val;
        
        if(convVal >= 4){
            convVal++;
            
            if(convVal >= 6){
                convVal++;
            }
        }
        
        return convVal;
    }
    
    public void showConvNum(){
        boolean printFlag = false;
        for(int i = 10;i >= 1;i--){
            int octalNumber = extrOctalDigit(n, i);
            if(octalNumber > 0){
                printFlag = true;
            }
            if(printFlag){
                System.out.print(singleDigitConv(octalNumber));
            }
        }
        
        if(!printFlag){
            System.out.print(0);
        }
        
        System.out.println();
    }
}

