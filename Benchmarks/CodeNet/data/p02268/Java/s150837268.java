import java.util.Scanner;
public class Main {
    static int n;
    static int s[];
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = new int[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt(); 
        int t[] = new int[q];
        for(int i=0;i<q;i++){
            t[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i: t){
            if(bsearch(i, 0, n-1)){
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
    
    public static boolean bsearch(int k, int i, int j){
        
        if(s[(i+j)/2]==k){
            return true;
        }else if(i>j){
            return false;
        }else if(s[(i+j)/2]<k){
            return bsearch(k, (i+j)/2+1, j);
        }else if(s[(i+j)/2]>k){
            return bsearch(k, i, (i+j)/2-1);
        }
        return false;
    }
}
