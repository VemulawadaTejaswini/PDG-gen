import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] s = new int[14];
        int[] h = new int[14];
        int[] c = new int[14];
        int[] d = new int[14];
        
        String str ; int m ;
        for(int i=0;i<n;i++){
            str=sc.next();m=sc.nextInt();
            switch(str.charAt(0)){
                case 'S':s[m]=-1;break;
                case 'H':h[m]=-1;break;
                case 'C':c[m]=-1;break;
                case 'D':d[m]=-1;break;
            }
        }
        
        for(int i=1;i<=13;i++){
            if (s[i]==0)System.out.printf("S %d\n",i);
        }
        for(int i=1;i<=13;i++){
            if (h[i]==0)System.out.printf("H %d\n",i);
        }
        for(int i=1;i<=13;i++){
            if (c[i]==0)System.out.printf("C %d\n",i);
        }
        for(int i=1;i<=13;i++){
            if (d[i]==0)System.out.printf("D %d\n",i);
        }
    }
}
