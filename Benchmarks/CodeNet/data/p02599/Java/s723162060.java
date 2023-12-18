import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int count = 0;
        int[] array = new int[n];  
        for(int i = 0; i < n; i++){
            array[i] = in.nextInt();
        }
        HashSet<Integer> set;
        // int[][] ans = new int[n][n];
        // for(int i = 0; i < n ;i++){
        //     set = new HashSet<Integer>();
        //     for(int j = i; j < n; j++){
        //         set.add(array[j]);
        //         ans[i][j] =  set.size();
        //     }
        // }
        // for(int i = 0; i < n; i++){
        //     System.out.println(Arrays.toString(ans[i]));
        // }
        for(int i = 0; i < q; i++){
            int start = in.nextInt();
            int end = in.nextInt();
            set = new HashSet<Integer>();
            for(int j = start-1; j < end; j++){
                set.add(array[j]);
            }
            System.out.println(set.size());
        }
        
    }
}