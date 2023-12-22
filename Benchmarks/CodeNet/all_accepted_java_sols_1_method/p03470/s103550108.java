import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[] list = new Integer[n];

        for(int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }

        Arrays.sort(list);
        
        int t = list[0];
        int ans = 1;

        for(int i = 1; i < n; i++){
            if(list[i] != t){
                t = list[i];
                ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}