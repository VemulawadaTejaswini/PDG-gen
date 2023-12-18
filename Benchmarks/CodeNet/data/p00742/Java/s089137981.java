import java.util.*;

public class Main{

    int n, k, cnt;
    String[] string;
    ArrayList<Character> head, appear;
    int[] num;
    long[] coeff;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            if(n==0) break;
            string = new String[n];
            for(int i=0; i<n; i++) string[i] = sc.next();
            head = new ArrayList<Character>();
            appear = new ArrayList<Character>();
            for(int i=0; i<n; i++){
                char ch = string[i].charAt(0);
                if(!head.contains(ch) && string[i].length()!=1) head.add(ch);
                for(int j=0; j<string[i].length(); j++){
                    char c = string[i].charAt(j);
                    if(!appear.contains(c)) appear.add(c);
                }
            }

            coeff = new long[appear.size()];
            long coe = 1;
            for(int i=0; i<n; i++){
                coe = 1;
                for(int j=string[i].length()-1; j>=0; j--){
                    if(i!=n-1)coeff[appear.indexOf(string[i].charAt(j))] += coe;
                    else coeff[appear.indexOf(string[i].charAt(j))] -= coe;
                    coe *= 10;
                }
            }
 
            cnt = 0;
            k = appear.size();
            num = new int[k];
            dfs(0,new int[10]);

            System.out.println(cnt);
        }
    }

    void dfs(int pos, int[] used){
        if(pos==k){
            if(equal()) cnt++;
            return;
        }

        for(int i=0; i<10; i++){
            if(used[i]==0){
                if(i==0 && head.contains(appear.get(pos))) continue;
                num[pos] = i;
                used[i] = 1;
                dfs(pos+1,used);
                used[i] = 0;
            }
        }
    }

    boolean equal(){
        long sum = 0;
        for(int i=0; i<appear.size(); i++) sum += coeff[i]*num[i];
        return sum==0 ? true:false;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}