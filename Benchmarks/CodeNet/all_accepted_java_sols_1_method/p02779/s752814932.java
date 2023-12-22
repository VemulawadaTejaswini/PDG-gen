import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Set<Integer> as = new HashSet<Integer>();
        String ans = "YES";
        for(int i = 0 ;i<a.length;i++){
            a[i] = sc.nextInt();
            as.add(a[i]);
        }
        if(a.length!=as.size()){
            ans = "NO";
        }
        System.out.println(ans);
    }
}