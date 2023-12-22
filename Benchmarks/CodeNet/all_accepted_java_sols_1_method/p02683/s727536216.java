import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Harry on 5/10/20.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[] C = new int[n];
        int[] M = new int[m];
        int[][] A = new int[n][m];
        for(int i=0; i<n; i++){
            C[i] = scanner.nextInt();
            for(int j=0; j<m; j++){
                A[i][j] = scanner.nextInt();
            }
        }
        HashMap<Integer, int[]> map = new HashMap<>();
        HashMap<Integer, int[]> newMap = new HashMap<>();
        map.put(0, new int[m]);
        for(int i=0; i<n; i++){
            for(int prevMask : map.keySet()){
                //0
                int newMask = prevMask<<1;
                int[] newM = new int[m];
                int[] prevM = map.get(prevMask);
                System.arraycopy(prevM, 0, newM, 0, m);
                newMap.put(newMask, newM);
                //1
                newMask = (prevMask<<1)+1;
                newM = new int[m];
                for(int j=0; j<m; j++){
                    newM[j] = prevM[j]+A[i][j];
                }
                newMap.put(newMask, newM);
            }

            HashMap<Integer, int[]> temp = newMap;
            newMap = map;
            map = temp;
            newMap.clear();
        }

        int min = Integer.MAX_VALUE;
        for(int mask : map.keySet()){
            int cost = 0;
            boolean isValid = true;
            int[] curM = map.get(mask);
            for(int b=0; b<n; b++){
                boolean isRead = (mask&(1<<b))>0;
                if(isRead){
                    int actualB = n-1-b;
                    cost += C[actualB];
                }
            }
            for(int algo=0; algo<m; algo++){
                if(curM[algo]<x){
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                min = Math.min(cost, min);
            }
        }
        System.out.print(min==Integer.MAX_VALUE ? -1 : min);
    }
}
