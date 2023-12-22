
import java.util.*;

public class Main {

    static final int MOD=1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int b[] = new int[n];
        int ans[] = new int[n];
        for(int i=0;i<n;i++)b[i]=sc.nextInt();

        for(int j=n;j>0;j--) {

            int remove = -1;
            int index=-1;
            for (int i = 0; i < j; i++) {
                if (b[i] == i + 1) {
                    remove = Math.max(remove, b[i]);
                    index = i;
                }
            }

            if (remove == -1) {
                System.out.println(-1);
                return;
            }
            b[index]=-1;
            ans[j-1]=remove;
            boolean flag=false;
            for(int i=0;i<j-1;i++){
                if(flag){
                    b[i]=b[i+1];
                }else{
                    if(b[i]==-1){
                        flag=true;
                        b[i]=b[i+1];
                    }
                }

            }

        }
        for(Integer a:ans) System.out.println(a);
    }
}
