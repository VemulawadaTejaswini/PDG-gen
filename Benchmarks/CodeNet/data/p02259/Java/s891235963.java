import java.io.*;
import java.util.*;



class Main{
    //読み込みのテンプレ(stringオブジェクトまで)
    
    static int N;
    static int[] sequence;
    static int count;
    
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int[] sequence = new int[N];
        
        for(int i=0;i<N;i++){
            sequence[i]=scanner.nextInt();
        }
        
        sequence =  doBubblesort(sequence);
        showResult(sequence);
        System.out.println(count);
    }
    
    
    public static int[] doBubblesort(int[] sequence){
        for(int i=0;i<sequence.length-1;i++){
            for(int j=sequence.length-1;j>i;j--){
                if(sequence[j] < sequence[j-1]){
                    int x = sequence[j];
                    int y = sequence[j-1];
                    sequence[j] = y;
                    sequence[j-1]= x;
                    count++;
                }
            }
        }
        
        return sequence;
    }
    
    
    public static void showResult(int[] sequence){
        for(int i =0;i<sequence.length-1;i++){
            int number = sequence[i];
            System.out.print(number + " ");
        }
        
        System.out.println(sequence[sequence.length-1]);
    }
    
}