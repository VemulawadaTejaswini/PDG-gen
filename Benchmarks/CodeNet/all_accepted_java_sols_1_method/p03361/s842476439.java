import java.util.*;
 
 
class Main {
    static int abc[];
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        String s[][] = new String[H][W];
        for(int i=0; i<H; i++){
            String scan[] = sc.next().split("",0);
            for(int j=0; j<scan.length; j++){
                s[i][j] = scan[j];
            }
        }
        int[] d[] = {{-1,0},{1,0},{0,-1},{0,1}};

        boolean ans = true;
        for(int i=0; i<H; i++){          
            for(int j=0; j<W; j++){
                if(s[i][j].equals("#")){
                    int cnt = 0;
                    for(int k=0; k<4; k++){
                        
                        if((i==0 && k==0) || (i==H-1 && k==1) || (j==0 && k==2) || (j==W-1 && k==3)) continue;
                        if(s[i + d[k][0]][j + d[k][1]].equals("#")){
                            cnt++;
                        }
                    }
                    if(cnt==0) ans=false;
                }
            }
        }
        if(ans){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}