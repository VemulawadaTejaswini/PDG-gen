import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int inputHeight = sc.nextInt();
        int inputWeight = sc.nextInt();
        int[][] tableCalc = new int[inputHeight+1][inputWeight+1];
        
        //入力
        for(int hei = 0; hei < inputHeight; hei++){
            for(int wei = 0; wei < inputWeight; wei++){
                tableCalc[hei][wei] = sc.nextInt();
            }
        }
        
        //合計値格納
        for(int hei = 0; hei <= inputHeight; hei++){
            int sum  = 0;
            for(int wei = 0; wei <= inputWeight; wei++){
                if(wei == inputWeight){
                    tableCalc[hei][wei] = sum;
                }else{
                    sum += tableCalc[hei][wei];
                }
            }
        }
        
        //合計値格納
        for(int wei = 0; wei <= inputWeight; wei++){
            int sum  = 0;
            for(int hei = 0; hei <= inputHeight; hei++){
                if(hei == inputHeight){
                    tableCalc[hei][wei] = sum;
                }else{
                    sum += tableCalc[hei][wei];
                }
            }
        }
        
        //出力
        for(int hei = 0; hei <= inputHeight; hei++){
            for(int wei = 0; wei <= inputWeight; wei++){
                if(wei == inputWeight){
                    System.out.print(tableCalc[hei][wei] + "\n");
                    break;
                }
                System.out.print(tableCalc[hei][wei] + " ");
            }
        }
    }
}

