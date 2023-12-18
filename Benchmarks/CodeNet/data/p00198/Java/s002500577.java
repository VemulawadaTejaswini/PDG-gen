import java.util.*;

public class Main{

    ArrayList<char[]> color,list;
    ArrayList<String> clist;

    void solve(){
        Scanner sc = new Scanner(System.in);

        clist = new ArrayList<String>();
        clist.add("Red");
        clist.add("Yellow");
        clist.add("Blue");
        clist.add("Magenta");
        clist.add("Green");
        clist.add("Cyan");

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            color = new ArrayList<char[]>();
            int cnt = 0;
            for(int i=0; i<n; i++){
                char[] c = new char[6];
                for(int j=0; j<6; j++) c[j] = (char)clist.indexOf(sc.next());
                if(same(c)) cnt++;
                else color.add(c);
            }

            System.out.println(cnt);
        }
    }

    int[][] rotate = {{1,2,4,3},{0,4,5,1},{0,2,5,3}};

    boolean same(char[] dice){
        list = new ArrayList<char[]>();
        for(int i=0; i<4; i++){
            dice = rotate(dice,0);
            for(int j=0; j<4; j++){
                dice = rotate(dice,1);
                for(int l=0; l<4; l++){
                    dice = rotate(dice,2);
                    list.add(dice);
                }
            }
        }

        for(int i=0; i<list.size(); i++){
            char[] s1 = list.get(i);
            for(int j=0; j<color.size(); j++){
                boolean boo = false;
                char[] s2 = color.get(j);
                for(int k=0; k<6; k++){
                    if(s1[k]!=s2[k]){
                        boo = false;
                        break;
                    }
                    boo = true;
                }
                if(boo) return true;
            }
        }
        return false;
    }

    char[] rotate(char[] dice, int idx){
        char[] res = new char[6];
        for(int i=0; i<6; i++) res[i] = dice[i];

        char tmp = res[rotate[idx][3]];
        for(int i=3; i>0; i--) res[rotate[idx][i]] = res[rotate[idx][i-1]];
        res[rotate[idx][0]] = tmp;
        return res;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}