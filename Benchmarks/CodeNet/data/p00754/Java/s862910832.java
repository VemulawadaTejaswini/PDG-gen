import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);
        while(true){
            char[] line = sc.nextLine().toCharArray();
            if(line.length==1 && line[0]=='.') break;

            boolean boo = true;
            LinkedList<Character> moji = new LinkedList<Character>();
            for(int i=0; i<line.length; i++){
                if(line[i]=='(' || line[i]=='[' || line[i]=='{'){
                    moji.add(line[i]);
                    continue;
                }
                if((line[i]==')'  || line[i]==']' || line[i]=='}')){
                    if(moji.size()==0) {boo = false; break;}
                    char c = moji.pollLast();
                    if((c=='(' && line[i]==')') || (c=='[' && line[i]==']') || (c=='{' && line[i]=='}')) continue;
                    else {boo = false; break;}
                }
            }

            if(boo) System.out.println("yes");
            else System.out.println("no");
        }

    }

    public static void main(String[] args){
        new Main().solve();
    }
}