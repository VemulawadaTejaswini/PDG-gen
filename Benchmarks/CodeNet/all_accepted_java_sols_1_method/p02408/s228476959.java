import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[][] cardlist=new int[4][13];
        String m="";
        int n,mn=0;
        int a=scan.nextInt();
        
            for(int i=0; i<a; i++){
                m=scan.next();
                n=scan.nextInt();
                switch(m){
                    case "S":mn=0;break;
                    case "H":mn=1;break;
                    case "C":mn=2;break;
                    case "D":mn=3;break;
                }
                cardlist[mn][n-1]=1;
            }
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                if(cardlist[i][j]==1)continue;
                switch(i){
                    case 0:m="S";break;
                    case 1:m="H";break;
                    case 2:m="C";break;
                    case 3:m="D";break;
                }
                System.out.println(m+" "+(j+1));
            }
        }
    }
}
