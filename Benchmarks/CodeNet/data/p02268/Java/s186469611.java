import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for(int i = 0; i < n; i++){
            s[i] = scanner.nextInt();
        }
        Arrays.sort(s);
        int q = scanner.nextInt();
        int[] t = new int[n];
        for(int i = 0; i < q; i++){
            t[i] = scanner.nextInt();
        }

        int ans = 0;
        for(int i = 0; i < q; i++){
            int target = t[i];
            int head = 0;
            int tail = n-1;
            while(head <= tail){
                int middle = (head + tail)/2;
                //System.out.println(s[middle]);
                if(s[middle] == target){ans++;break;}
                else if(s[middle] < target){head = middle+1;}
                else{tail = middle-1;}
                
            }
        }
        System.out.println(ans);
    }
}
