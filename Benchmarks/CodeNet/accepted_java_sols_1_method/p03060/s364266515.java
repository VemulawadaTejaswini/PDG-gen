import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //N,V,Cを取り込む
        int N = s.nextInt();
        int Vn[] = new int[N];
        int Cn[] = new int[N];

        for(int i=0;i<N;i++){
            Vn[i]=s.nextInt();
        }
        for(int i=0;i<N;i++){
            Cn[i]=s.nextInt();
        }
        int ans=0;
        //V-Nを計算して、1以上ならansに足していく
        for(int i=0;i<N;i++){
            int check=0;
            check=Vn[i]-Cn[i];
            if(check>0){
                ans+=check;
            }
            check=0;
        }
        System.out.print(ans);
    }
}