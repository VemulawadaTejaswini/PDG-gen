import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int[][] map =new int[10][10];
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                map[i][j]=0;
            }
        }
        while(sc.hasNextLine()){
            String[] s=sc.nextLine().split(",");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            int size=Integer.parseInt(s[2]);
            if(size==1){
                small(x,y);
            }else if(size==2){
                medium(x,y);
            }else{
                large(x,y);
            }
        }
        int ans1=0,ans2=0;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(map[i][j]==0){
                    ans1++;
                }
                if(map[i][j]>ans2){
                    ans2=map[i][j];
                }
            }
        }
        System.out.println(ans1);
        System.out.println(ans2);
    }
    static void small(int x,int y){
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if((i+j>=-1)
                        &&(i+j<=1)
                        &&(x+i>=0)
                        &&(x+i<10)
                        &&(y+j>=0)
                        &&(y+j<10)){
                    map[x+i][y+j]++;
                }
            }
        }
    }
    static void medium(int x,int y){
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                if((x+i>=0)
                        &&(x+i<10)
                        &&(y+j>=0)
                        &&(y+j<10)){
                    map[x+i][y+j]++;
                }
            }
        }
    }
    
    static void large(int x,int y){
        for(int i=-2;i<=2;i++){
            for(int j=-2;j<=2;j++){
                if((i+j>=-2)
                        &&(i+j<=2)
                        &&(x+i>=0)
                        &&(x+i<10)
                        &&(y+j>=0)
                        &&(y+j<10)){
                    map[x+i][y+j]++;
                }
            }
        }
    }
}