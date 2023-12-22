
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum = 0;
        int[][] numlist = new int[m][n+1];
        List<Integer> plist = new ArrayList<>();
        for(int i=0;i<m;i++){
            int k = in.nextInt();
            numlist[i][0]=k;
            for(int j=0;j<k;j++){
                numlist[i][j+1] = in.nextInt();
            }
        }
        for(int i=0;i<m;i++)
            plist.add(in.nextInt());

        for(int i=0;i< 1<<n;i++){
            int att = 0,z=0;
            for(int j=0;j<m;j++){
                att = 0;
               for(int k=0;k<numlist[j][0];k++){
                   z = numlist[j][k+1]-1;
                   att ^= (i>>z & 1);
               }
               if(att != plist.get(j))  break;
               else if(j==m-1){
                   sum++;
               }
            }
        }
        System.out.println(sum);
    }
}
