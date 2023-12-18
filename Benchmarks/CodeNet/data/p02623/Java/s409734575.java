import java.util.Scanner;

//クラス名は必ずMainにする必要があります。



public class Main {
    public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        double num = 0;
        int[] n_ary = new int[n];
        int[] m_ary = new int[m];
        
        

        for(int i = 0; i < n; i++){
            n_ary[i] = Integer.parseInt(sc.next());
        }
        for(int i = 0; i < m; i++){
            m_ary[i] = Integer.parseInt(sc.next());
        }

        int min = 0;
        int res = 0;
        int i = 0;
        int j = 0;
        while(true){
            if(i != n | j != m){
                if(i == n){
                    min = m_ary[j++];
                }else if(j == m){
                    min = n_ary[i++];
                }else if(n_ary[i] <= m_ary[j]){
                    min = n_ary[i++];
                }else if(n_ary[i] > m_ary[j]){
                    min = m_ary[j++];
                }
            }else{
                break;
            }
            
            if(num+min <= k){
                num += min;
                res++;
            }
            
        }
        System.out.println(res);
 	}
}