import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int juwelNum = sc.nextInt();

        int[] juwelValue = new int[juwelNum];
        for(int i = 0; i < juwelNum; i++){
            juwelValue[i] = sc.nextInt();
        }
        int[] juwelCost = new int[juwelNum];
        for(int i = 0; i < juwelNum; i++){
            juwelCost[i] = sc.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < juwelNum; i++){
            if(juwelValue[i] > juwelCost[i]){
                ans += juwelValue[i] - juwelCost[i];
            }
        }

        System.out.println(ans);
    }
}