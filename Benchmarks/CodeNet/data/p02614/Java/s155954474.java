import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                int H = scan.nextInt();
                int W = scan.nextInt();
                int K = scan.nextInt();
                
                char[][] c= new char[H][W];
                for(int i=0; i<H; i++){
                    String cstring = scan.next();
                    for(int j=0; j<W; j++){ 
                        c[i][j] = cstring.charAt(j);
                    }
                }

                int ans=0;
                int black =0;
                for(int i=0; i< (1<< H);i++){
                    for(int j=0; j< (1<<W);j++){
                        black = 0;
                        for(int k=0; k<H; k++){
                            if((i&(1<<k))==0){
                                for(int l=0; l<W; l++){
                                    if((j&(1<<l))==0){
                                        if(c[k][l]=='#'){
                                            black++;
                                        }
                                    }
                                }
                            }
                        }
                        if(black==K){
                            ans++;
                        }
                    }
                }
                
                System.out.println(ans);
        }               
}