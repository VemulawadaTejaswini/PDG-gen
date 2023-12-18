import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Input input = new Input();
        int caseNumCount = 10000;
        for(int caseNumber = 1; caseNumber <= caseNumCount; caseNumber++){
            int inputNum = input.inputNum(); 
            if( inputNum == 0){
                break;
            }else{
                System.out.println( "Case" + " " + caseNumber + ":" + " " + inputNum);
            }
        }
    }
}

class Input{
    Scanner sc;
    public Input(){
        this.sc = new Scanner(System.in);
    }
    public int inputNum() throws Exception{
        return this.sc.nextInt();
    }
}
