import java.util.*;
public class Main {

    static int[] f = null;

    static int rhs(int a, int b, int c){
        return ((a*a)+(b*b)+(c*c)+(a*b)+(b*c)+(a*c));
    }

    static void solve(){
        Scanner sc = new Scanner(System.in);
        int NOC = sc.nextInt(); 
        int count = 1;
        f = new int[10050];
        Arrays.fill(f,0);
        // Can we do better? I dont know..
        for(int i=1; i<=105;i++){
            for(int j=1; j<=105; j++){
                for(int k=1; k<=105; k++){
                    int val = rhs(i,j,k);
                    if(val<10050) f[val]+=1;
                }
            }
        }
    
        for(int a: f) {
            System.out.println(a);
            if(count==NOC) break;
            count++;
        }
        sc.close();
    }
    
    public static void main(String args[]) {
        solve();
    }
}