import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int mx =1000;
        int count = (int)Math.sqrt(mx);
        int[] num = new int[mx+1];
        int mod = (int)(1e9+7);
        ArrayList<Integer> prime = new ArrayList<>();
        HashSet<Integer> p = new HashSet<>();
        for(int i=2;i<=count;i++){
            int add = i;
            int cur = i;
            if(num[cur]==0){
                cur+=add;
                while (cur<=mx){
                    num[cur] = 1;
                    cur+=add;
                }
            }
        }
        for(int i=2;i<=mx;i++){
            if (num[i]==0){
                prime.add(i);
                p.add(i);
            }
        }
        int n = in.nextInt();
        if(n==1){
            System.out.println(1);
        }
        else {
            int ans = 0;
            int[] check = new int[mx+1];
            for(int i=2;i<=n;i++){
                int cur = i;
                int idex = 0;
                while (cur>1){
                    if (p.contains(cur)){
                        check[cur]+=1;
                        break;
                    }
                    else {
                        if (cur%prime.get(idex)==0){
                            cur = cur/prime.get(idex);
                            check[prime.get(idex)]+=1;
                            idex=0;
                        }
                        else {
                            idex++;
                        }
                    }

                }

            }
            long totol =1;
            for(int k=0;k<=n;k++){
                totol*= check[k]+1;
                totol%=mod;
            }
            System.out.println(totol);

        }
    }
}
