import java.util.*;
public class Main{
    String[] AND = {"(0*0)","(0*1)","(0*2)",
                    "(1*0)","(1*1)","(1*2)",
                    "(2*0)","(2*1)","(2*2)"};
    String[] AND_RESULT = {"0","0","0",
                           "0","1","1",
                           "0","1","2"};
    String[] OR = {"(0+0)","(0+1)","(0+2)",
                   "(1+0)","(1+1)","(1+2)",
                   "(2+0)","(2+1)","(2+2)"};
    String[] OR_RESULT = {"0","1","2",
                          "1","1","2",
                          "2","2","2"};
    String[] INV = {"-0","-1","-2"};
    String[] INV_RESULT = {"2","1","0"};
    
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String exp = sc.next().replace("--", "");
            if(exp.equals(".")){
                break;
            }
            int count = 0;
            for(int p = 0; p <= 2; p++){
                for(int q = 0; q <= 2; q++){
                    for(int r = 0; r <= 2; r++){
                        String tmp = exp.replace("P", p + "");
                        tmp = tmp.replace("Q", q + "");
                        tmp = tmp.replace("R", r + "");
                        if(calc(tmp).equals("2")){
                            count++;
                        }
                    }
                }                
            }
            System.out.println(count);
        }

    }
    String calc(String exp){
        //System.out.println("init: " + exp);
        while(exp.length() != 1){
            for(int i = 0; i < INV.length; i++){
                exp = exp.replace(INV[i], INV_RESULT[i]);
            }
            for(int i = 0; i < AND.length; i++){
                exp = exp.replace(AND[i], AND_RESULT[i]);
            }
            for(int i = 0; i < OR.length; i++){
                exp = exp.replace(OR[i], OR_RESULT[i]);
            }
        }
        //System.out.println("return: " + exp);
        return exp;
    }
    public static void main(String[] args){
        new Main().run();
    }
}