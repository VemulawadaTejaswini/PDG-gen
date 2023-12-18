import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] bubNum = new int[sc.nextInt()];
        
        for(int i = 0; i < bubNum.length; i++){
            bubNum[i] = sc.nextInt();
        }
        BubbleSort bs = new BubbleSort(bubNum);
        bs.changeOfBubNum();
        bs.outPutOfBubNum();
        bs.outPutOfBubCount();
    }
}

class BubbleSort{
    int[] bubNum;
    public BubbleSort(int[] bubNum){
        this.bubNum = bubNum;
    }
    
    int count = 0;
    public void changeOfBubNum(){
        int minNum = 0;
        for(int i = 0, j; i < bubNum.length; i++){
            if(i == 0){
                continue;
            }
            minNum = bubNum[i];
            j = i - 1;
            while(j >= 0 && bubNum[j] > minNum){
                bubNum[j + 1] = bubNum[j];
                count++;
                j--;
            }
            bubNum[j + 1] = minNum;
        }
    }
    
    public void outPutOfBubNum(){
        for(int i = 0; i < bubNum.length; i++){
            if(i == 0){
                System.out.print(bubNum[i]);
                continue;
            }
            System.out.print(" " + bubNum[i]);
        }
        System.out.print("\n");
    }
    
    public void outPutOfBubCount(){
         System.out.println(count);
    }
}
