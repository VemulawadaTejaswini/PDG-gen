import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n+m==0)break;
            int[][]data = new int[m][3];
            int[] com= new int[n];
            com[0]=1;
                    
            for (int i = 0; i < data.length; i++) {
                data[i][0]=sc.nextInt();
                data[i][1]=sc.nextInt()-1;
                data[i][2]=sc.nextInt()-1;
            }
            Arrays.sort(data,new Comparator<int[]>(){
                @Override
                public int compare(int[] arg0, int[] arg1) {
                    return arg0[0]-arg1[0];
                }
            });
            for (int i = 0; i < data.length; i++) {
                int s = data[i][1];
                int d = data[i][2];
                if(com[s]>0){
                    com[d]=1;
                }
            }
            int ans=0;
            for (int i = 0; i < com.length; i++) {
                if(com[i]>0)ans++;
            }
            System.out.println(ans);
        }
    }

}