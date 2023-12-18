import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        long ch = 0;
        for(int i = 0; i < n; i++){
            a.add(scan.nextInt());
            ch += a.get(i);
        }
        for(int i = 0; i < m; i++){
            b.add(scan.nextInt());
            ch += b.get(i);
        }
        //合計がk以下の時
        if(ch <= k){
            System.out.println(n + m);
            return;
        }
        if(a.get(0) > k && b.get(0) > k){
            System.out.println(0);
            return;
        }
        n--;
        m--;
        while(ch > k){
            if(n <= 0 && m > 0){
                ch -= b.get(m);
                b.remove(m);
                m--;
                continue;
            }else if(m <= 0 && n > 0){
                ch -= a.get(n);
                a.remove(n);
                n--;
                continue;
            }else if(n <= 0 && m <= 0){
                break;
            }
            if(a.get(n) <= b.get(m)){
                ch -= a.get(n);
                a.remove(n);
                n--;
            }else{
                ch -= b.get(m);
                b.remove(m);
                m--;
            }
        }
        System.out.println(a.size() + b.size() + 1);
        scan.close();
    }
}