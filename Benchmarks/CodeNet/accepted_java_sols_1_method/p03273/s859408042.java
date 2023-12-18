import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String []a = new String [H];
        
        for(int i=0; i<H; i++){
            a[i] = sc.next();
        }
        
        boolean [] judge1 = new boolean [H];
        boolean [] judge2 = new boolean [W];
        
        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                if(a[i].charAt(j) == '#'){
                    judge1[i] = true;
                    judge2[j] = true;
                }
            }
        }
        
        for(int i=0; i<H; i++){
            if(judge1[i] == false){
                continue;
            }
            for(int j=0; j<W; j++){
                if(judge2[j] == false){
                    continue;
                }
                System.out.print(a[i].charAt(j));
            }
            System.out.println("");
        }

    }
}