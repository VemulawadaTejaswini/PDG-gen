import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String ss = sc.next();
        char[] s = ss.toCharArray();
        int[] ac = new int[n+1];
        ArrayList<Integer> acl = new ArrayList<>();
        int i = 1;
        boolean prevA = false;
        for(char c : s){
            if(c == 'A'){
                prevA = true;
            }else if(c == 'C' && prevA){
                //System.out.println(i-1);
                ac[i-1]++;
                prevA = false;
            }else{
                prevA = false;
            }
            i++;
        }
        //System.out.print(ac[0] + " ");
        for(int j = 1; j <= n; j++){
            ac[j] += ac[j-1];
            //System.out.print(ac[j] + " ");
        }
        //System.out.println();
        for(int j = 0; j < q; j++){
            int left = sc.nextInt()-1;
            int right = sc.nextInt()-1;
            System.out.println(ac[right] - ac[left]);
        }
    }
}