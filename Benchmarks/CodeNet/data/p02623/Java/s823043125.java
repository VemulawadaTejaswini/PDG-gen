
import java.util.*;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] s1 = new int[n];int[] s2 = new int[m];
        for(int i = 0;i<n;i++){
            s1[i] = sc.nextInt();
        }
        for(int i = 0;i<m;i++){
            s2[i] = sc.nextInt();
        }
        ArrayList<Integer> ls = new ArrayList<>();
        int i = 0, j = 0;
        while(i < n || j < m){
            try{
                ls.add(s1[i]);
                i++;
            }catch(Exception e){

            }
            try{
                ls.add(s2[j]);
                j++;
            }catch(Exception e){}
        }
        // System.out.println(ls);
        i = 0;
        int sum = 0, counter = 0;
        while(sum < k){
            sum += ls.get(i);
            if(sum > k)
                break;
            counter++;
            i++;
        }
        System.out.println(counter);
    }
}