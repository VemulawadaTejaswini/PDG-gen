import java.io.*;
import java.util.*;



class Main{
    //読み込みのテンプレ(stringオブジェクトまで)
    
    static int minimum;
    static int gap;
    
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int minimum = scanner.nextInt();
        int time = scanner.nextInt();
        
        //minimumはその時点での最小値のことである
        
        gap = time - minimum;
        if(minimum >= time)minimum = time;
        
        for(int i = 0;i<number - 2;i++){
            time = scanner.nextInt();
            
            if(time - minimum >= gap)gap = time - minimum;
            if(minimum >= time)minimum = time;
        }
        
        System.out.println(gap);
    
    
    }
}