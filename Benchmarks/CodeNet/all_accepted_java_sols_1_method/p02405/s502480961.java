import java.util.*;
public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        while(true){
            int h = Integer.parseInt(sc.next());
            int w = Integer.parseInt(sc.next());
            
            if(h==0 && w==0) break;
            
            for(int i=0; i<h; i++){
                for(int j=0; j<w; j++){
                    /*
                    //偶数行の場合
                    if(i%2 == 0){
                        //偶数番目の文字は「#」、奇数番目の文字は「.」
                        if(j%2 == 0) System.out.print("#");
                        else System.out.print(".");
                    }
                    //奇数行の場合
                    else{
                        //偶数番目の文字は「.」、奇数番目の文字は「#」
                        if(j%2 == 0) System.out.print(".");
                        else System.out.print("#");
                    }
                    */
                    //i+jが偶数の場合「#」、奇数の場合「.」
                    if((i+j)%2 == 0) System.out.print("#");
                    else System.out.print(".");
                    
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}

