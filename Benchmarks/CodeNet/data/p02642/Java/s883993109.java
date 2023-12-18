import java.util.*;


class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];
        Set<Integer> list = new HashSet<Integer>();
        for(int i = 0;i<a.length;i++){
            a[i]= sc.nextInt();
            list.add(a[i]);
        }
        Arrays.sort(a);
        int ans = a.length;
        for(int i = 1;i<a.length;i++){
            for(int j = i-1;j>=0;j--){
                if(a[i]%a[j]==0){
                    ans --;
                    break;
                }
            }
        }
        if(a[0]==a[1]){
            ans --;
        }
        System.out.println(ans);
    }
}
