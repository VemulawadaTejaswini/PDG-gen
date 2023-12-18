import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=Integer.parseInt(sc.next());
        int[] tokuten = new int[N];
        int[][] kaisu=new int[101][3];
        Arrays.fill(tokuten, 0);
        int[][] kaita= new int[N][3];
        for(int i=0;i<N;i++){
            for(int j=0;j<3;j++){
                kaita[i][j]=Integer.parseInt(sc.next());
                kaisu[kaita[i][j]][j]++;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<3;j++){
                if(kaisu[kaita[i][j]][j]==1){
                    tokuten[i]+=kaita[i][j];
                }
            }
        }
        for(int i=0;i<N;i++){
            System.out.println(tokuten[i]);
        }
    }
}