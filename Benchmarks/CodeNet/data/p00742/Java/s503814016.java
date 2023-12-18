import java.util.*;

class Main{

    String[] s;
    ArrayList<Character> list;
    HashSet<Character> notZero;
    int[] num;
    boolean[] boo;
    int cnt;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;
            s = new String[n];
            for(int i=0; i<n; i++) s[i] = sc.next();
            
            list = new ArrayList<Character>();
            notZero = new HashSet<Character>();
            HashSet<Character> appear = new HashSet<Character>();
            for(int i=0; i<n; i++){
                for(int j=0; j<s[i].length(); j++){
                    char c = s[i].charAt(j);
                    if(j==0 && s[i].length()!=1) notZero.add(c);
                    if(appear.add(c)) list.add(c);
                }
            }
            
            num = new int[list.size()];
            boo = new boolean[10];
            cnt = 0;
            rec(0);
            System.out.println(cnt);
        }
    }

    void rec(int alpha){
        if(alpha==list.size()){
            int sum = 0;
            for(int i=0; i<s.length-1; i++){
                String ns = "";
                for(int j=0; j<s[i].length(); j++){
                    ns += num[list.indexOf(s[i].charAt(j))];
                }
                sum += Integer.parseInt(ns);
            }
            int goal = 0;
            String ns2 = "";
            for(int i=0; i<s[s.length-1].length(); i++){
                ns2 += num[list.indexOf(s[s.length-1].charAt(i))];
            }
            goal = Integer.parseInt(ns2);

            //System.out.println(Arrays.toString(num));
            //System.out.println(sum+" "+goal);
            if(sum==goal){
                cnt++;
                //System.out.println(Arrays.toString(num));
            }
            return;
        }

        for(int i=0; i<=9; i++){
            if(boo[i]) continue;
            if(i==0 && notZero.contains(list.get(alpha))) continue;
            num[alpha] = i;
            boo[i] = true;
            rec(alpha+1);
            boo[i] = false;
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}