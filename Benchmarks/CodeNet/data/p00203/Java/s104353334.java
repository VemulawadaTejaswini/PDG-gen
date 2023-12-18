import java.util.Scanner;

public class Main2 {
	 
    static int X,Y,ans;
    static int[][] field;
    static int[][] count;
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(true){
            X=cin.nextInt();
            Y=cin.nextInt();
            ans=0;
            if(X+Y==0){
                break;
            }
            field = new int[Y+2][X+2];
            count = new int[Y+2][X+2];
            for(int i = 0;i<Y+2;i++){
                for(int j = 0;j<X+2;j++){
                    field[i][j]=-1;
                }
            }
            for(int i = 0;i<Y;i++){
                for(int j = 1;j<X+1;j++){
                    field[i][j]=cin.nextInt();
                }
            }
            for(int i = 1;i<X+1;i++){
            	count[0][i]=1;
            }
            for(int i = 0;i<Y-1;i++){
            	for(int j = 1;j<=X;j++){
            		if(field[i][j]==0){
            			if(field[i+1][j-1]!=2)
            				count[i+1][j-1]+=count[i][j];
            			count[i+1][j]+=count[i][j];
            			if(field[i+1][j+1]!=2)
            				count[i+1][j+1]+=count[i][j];
            		}
            		else if(field[i][j]==1){
            			count[i][j]=0;
            		}
            		else if(field[i][j]==2){
            			
            			count[i+2][j]+=count[i][j];
            		}
            	}
            }
            for(int i = 1;i<=X;i++){
            	if(field[Y-1][i]!=1)
            		count[Y][i]+=count[Y-1][i];
            }
            for(int i = 0;i<Y+2;i++){
            	for(int j = 0;j<X+2;j++){
            		//System.out.print(count[i][j]+" " );
            	}
            	//System.out.println();
            }
            for(int i = 0;i<X;i++){
            	//System.out.println(count[Y][i+1]);
            	ans+=count[Y][i+1];
            }
            System.out.println(ans);
        }
    }
}