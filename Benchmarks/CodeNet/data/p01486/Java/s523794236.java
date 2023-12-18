import java.util.*;

class Main{

    char[] in;
    int p;

    void solve(){
        Scanner sc = new Scanner(System.in);

        in = sc.next().toCharArray();
        p = 0;

        boolean boo = cat();
        if(boo && p>=in.length) System.out.println("Cat");
        else System.out.println("Rabbit");
    }

    boolean cat(){

        if(in[p]=='m'){
            p++;
            if(in[p]!='e'){
                if(!cat()) return false;
            }
        }

        if(in[p]=='e'){
            p++;
            if(in[p]!='w'){
                if(!cat()) return false;
            }
        }
        
        if(in[p]=='w'){
            p++;
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}