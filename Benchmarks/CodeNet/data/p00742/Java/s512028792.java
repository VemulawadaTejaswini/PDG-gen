import java.util.*;

public class Main{

    int n, k, cnt;
    String[] string;
    ArrayList<Character> head, appear, appearOL, appearOR;
    int[] num;
    long[] coeff,coeff2;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            if(n==0) break;
            string = new String[n];
            for(int i=0; i<n; i++) string[i] = sc.next();
            head = new ArrayList<Character>();
            appear = new ArrayList<Character>();
            appearOL = new ArrayList<Character>();
            appearOR = new ArrayList<Character>();
            for(int i=0; i<n; i++){
                char ch = string[i].charAt(0);
                if(!head.contains(ch) && string[i].length()!=1) head.add(ch);
                for(int j=0; j<string[i].length(); j++){
                    char c = string[i].charAt(j);
                    if(!appear.contains(c)) appear.add(c);
                    if(!appearOL.contains(c) && i!=n-1) appearOL.add(c);
                    if(i==n-1 && !appearOR.contains(c)) appearOR.add(c);
                }
            }

            //係数求める
            coeff = new long[appearOL.size()];
            long coe = 1;
            for(int i=0; i<n-1; i++){
                coe = 1;
                for(int j=string[i].length()-1; j>=0; j--){
                    coeff[appearOL.indexOf(string[i].charAt(j))] += coe;
                    coe *= 10;
                }
            }
            coeff2 = new long[appearOR.size()];
            coe = 1;
            for(int i=string[n-1].length()-1; i>=0; i--){
                coeff2[appearOR.indexOf(string[n-1].charAt(i))] += coe;
                coe *= 10;      
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
        long sum = 0, result = 0;

        for(int i=0; i<appearOR.size(); i++){
            result += coeff2[i]*num[appear.indexOf(appearOR.get(i))];
        }

        for(int i=0; i<appearOL.size(); i++){
            sum += coeff[i]*num[appear.indexOf(appearOL.get(i))];
        }

        if(sum==result) return true;
        return false;
    }

    int getNumber(int s, int idx){
        return num[appear.indexOf(string[s].charAt(idx))];
    }

    public static void main(String[] args){
        new Main().solve();
    }
}