import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H,W;
        
        while(true){
            H = sc.nextInt();
            W = sc.nextInt();
            if((H==0)&&(W==0))break;
            
            int countH = H;
            while(true){
                int countW = W;
                
                while(true){
                    System.out.print("#");
                    countW--;
                    if(countW==0)break;
                    System.out.print(".");
                    countW--;
                    if(countW==0)break;
                }
                System.out.println();
                
                countH--;
                if(countH==0)break;
                
                countW = W;
                while(true){
                    System.out.print(".");
                    countW--;
                    if(countW==0)break;
                    System.out.print("#");
                    countW--;
                    if(countW==0)break;
                }
                System.out.println();
                countH--;
                if(countH==0)break;
                
            }
            System.out.println();
        }
    }
}