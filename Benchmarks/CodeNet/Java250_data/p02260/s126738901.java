import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] selSort = new int[sc.nextInt()];
        
        for(int i = 0; i < selSort.length; i++){
            selSort[i] = sc.nextInt();
        }
        
        SelectionSort ss = new SelectionSort(selSort);
        ss.changeOfSNum();
        ss.outPutOfSNum();
        ss.outPutCount();
    }
}

class SelectionSort{
    int[] selSort;
    public SelectionSort(int[] selSort){
        this.selSort = selSort;
    }
    
    int count = 0;
    public void changeOfSNum(){
        int maxNum = 0;
        int flag = 0;
        for(int i = 0, j; i < selSort.length; i++){
            maxNum = selSort[i];
            j = i + 1;
            while(j < selSort.length){
                if(selSort[j] < selSort[i]){
                    selSort[i] = selSort[j];
                    flag = j;
                }
                j++;
            }
            if(maxNum != selSort[i]){
                selSort[flag] = maxNum;
                count++;
            }
        }
    }
    
    public void outPutOfSNum(){
        for(int i = 0; i < selSort.length; i++){
            if(i == 0){
                System.out.print(selSort[i]);
                continue;
            }
            System.out.print(" " + selSort[i]);
        }
        System.out.print("\n");
    }
    
    public void outPutCount(){
        System.out.println(count);
    }
}
