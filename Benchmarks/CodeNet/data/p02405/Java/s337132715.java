import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int H,W;
        String tmpStr;        
        
        while(true){
            H = scan.nextInt();
            W = scan.nextInt();
            if(H==0 && W==0){
                return;
            }
            
            for(int i=0; i<H; i++){
                tmpStr = "";
                for(int j=0; j<W; j++){
                    tmpStr += (i%2+j)%2==0 ? "#" : ".";
                }
                System.out.println(tmpStr);
            }
        System.out.println();
        }
    }
}
