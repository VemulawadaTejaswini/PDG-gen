import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int W=sc.nextInt();
        int[][] map=new int[H][W];
        boolean[] isWhite=new boolean[H];
        
        for(int i=0;i<H;i++){
            String tmp=sc.next();
            for(int j=0;j<W;j++){
                if(tmp.charAt(j)=='#'){
                    map[i][j]=1;
                }else{
                    map[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<H;i++){
            isWhite[i]=true;
            for(int j=0;j<W;j++){
                if(map[i][j]==1){
                    isWhite[i]=false;
                    break;
                }
            }
        }
        
        for(int i=0;i<H;i++){
            if(isWhite[i]){
                for(int j=0;j<W;j++){
                    map[i][j]=2;
                }
            }
        }
        
        boolean[] check2=new boolean[W];
        
        for(int i=0;i<W;i++){
            check2[i]=true;
            for(int j=0;j<H;j++){
                if(map[j][i]==1){
                    check2[i]=false;
                    break;
                }
            }
        }

        for(int i=0;i<W;i++){
            if(check2[i]){
                for(int j=0;j<H;j++){
                    map[j][i]=2;
                }
            }
        }
        
        for(int i=0;i<H;i++){
            boolean print=false;
            for(int j=0;j<W;j++){
                if(map[i][j]==2){
                }else if(map[i][j]==1){
                    System.out.print('#');
                    print=true;
                }else{
                    System.out.print('.');
                    print=true;
                }
                    
            }
            
            if(print){
                System.out.println();
            }
        }
        
    }
}
