import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] m = new int[q];
        for(int i = 0; i < q; i++){
            m[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < Math.pow(2,n); i++){
            int ans = 0;
            for(int j = 0; j < n; j++){
                if ((1&i>>j) == 1) {ans += a[j];}
            }
            list.add(ans);
        }
        for(int i = 0; i < q; i++){
            if(list.contains(m[i])){System.out.println("yes");}
            else{System.out.println("no");}
        }
    }
}


