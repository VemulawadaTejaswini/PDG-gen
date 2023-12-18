import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main
 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int T = sc.nextInt();
            int P = sc.nextInt();
            int R = sc.nextInt();
            if(T+P+R==0)break;
            int[][] pena = new int[T][P];
            int[][] score = new int[T][3];
            for (int i = 0; i < score.length; i++) {
                score[i][2]=i+1;
            }
            for (int i = 0; i < R; i++) {
                int t = sc.nextInt()-1;
                int p = sc.nextInt()-1;
                int time = sc.nextInt();
                String s = sc.next();
                if(s.charAt(0)=='C'){
                    score[t][0]++;
                    score[t][1]+= pena[t][p]*1200 + time;
                } else {
                    pena[t][p]++;
                }
            }
            Arrays.sort(score,new Comparator<int[]>(){
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0]==o2[0]){
                        return o1[1]-o2[1];
                    }
                    return -(o1[0]-o2[0]);
                }
            });
            for (int i = 0; i < score.length; i++) {
                System.out.println(score[i][2]+" "+score[i][0]+" "+score[i][1]);
            }
        }
    }

}