import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int line =scn.nextInt();
        int row=scn.nextInt();
        int[][] bw = new int[line][row+1];
        for(int i=0;i<line;i++){
            String b=scn.next();
            int total=0;
            for(int j= 0;j<row+1;j++){
                if(j!=row){
                    if(b.charAt(j)=='.'){
                        bw[i][j]=0;
                    }else{
                        bw[i][j]=1;
                    }
                    total+=bw[i][j];
                }else{
                    bw[i][j]=total;
                }
            }
        }
        int[] cnt = new int[row];
        for(int i=0;i<row;i++){
            cnt[i]=0;
            int total=0;
            for(int j=0;j<line;j++){
                total+=bw[j][i];
            }
            cnt[i]=total;
        }
        for(int i=0;i<line;i++){
            if(bw[i][row]==0){
                continue;
            }else{
                for(int j=0;j<row;j++){
                    if(cnt[j]==0){
                        continue;
                    }else{
                        if(bw[i][j]==0){
                            System.out.print('.');
                        }else{
                            System.out.print('#');
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
