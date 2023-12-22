import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),m=sc.nextInt();
        int[] p = new int[m];
        String[] q = new String[m];
        boolean[] check = new boolean[n+1];
        int[] count = new int[n+1];
        int countAC = 0;
        int countWA = 0;
        for(int i = 0 ; i<m;i++){
            p[i] = sc.nextInt();
            q[i] = sc.next();
            if(q[i].equals("AC")){
                check[p[i]] = true;
            } else {
                if(!check[p[i]]){
                    count[p[i]] ++;
                }
            }
        }
        for(int i = 1;i<=n;i++){
            if(check[i]){
                countAC ++;
                countWA += count[i];
            }
        }
        System.out.println(countAC+" "+countWA);
    }
}