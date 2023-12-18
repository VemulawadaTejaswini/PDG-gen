import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt(),w=sc.nextInt();
        boolean[][] input=new boolean[h][w];
        String tmp;
        for(int i=0;i<h;i++){
            tmp=sc.next();
            for(int j=0;j<w;j++){
                input[i][j]=tmp.charAt(j)=='#';
            }
        }
        boolean t;
        int[] mov1={1,0,-1,0};
        int[] mov2={0,1,0,-1};
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                t=false;
               if(input[i][j]){
                   for(int k=0;k<4;k++){
                       try{
                           t=t||input[i+mov1[k]][j+mov2[k]];
                       }catch(Exception e){}
                   }
                   if(!t){
                       System.out.println("No");
                       return;
                   }
               } 
            }
        }
        System.out.println("Yes");


    }
}