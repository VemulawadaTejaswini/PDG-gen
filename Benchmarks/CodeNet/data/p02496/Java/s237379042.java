import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean[][] card=new boolean[4][13];

        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int mark=-1;
            String str=sc.next();
            int num=sc.nextInt();
            switch(str.charAt(0)){
            case 'S':
                mark=0;
                break;
            case 'H':
                mark=1;
                break;
            case 'C':
                mark=2;
                break;
            case 'D':
                mark=3;
                break;
            }
            card[mark][num-1]=true;
        }
        String markstr="";
        for(int i=0;i<4;i++){
            switch(i){
            case 0:
                markstr="S";
                break;
            case 1:
                markstr="H";
                break;
            case 2:
                markstr="C";
                break;
            case 3:
                markstr="D";
                break;
            }
            for(int j=0;j<13;j++){
                int sub=j+1;
                if(!card[i][j])System.out.println(markstr+" "+sub);
            }
}
}
}