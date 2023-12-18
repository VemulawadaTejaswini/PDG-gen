import java.io.*;
import java.util.*;

class Cards{
    char symbol;
    int num;
    int index;
}


//I have to use hashset
public class Main{
    static int count =0;
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        
        str = br.readLine();
        int n = Integer.parseInt(str);

        Cards A[] = new Cards[n];
        for(int i=0;i<n;i++){
            A[i] = new Cards();
        }

        for(int i=0;i<n;i++){
            str=br.readLine();
            String[] line = str.split("\\s");
            A[i].symbol = line[0].charAt(0);
            A[i].num = Integer.parseInt(line[1]);
            A[i].index = i;
        }
        
        
        quicks(A,0,n-1);
        //Stable 判定考える
        boolean flag = judge(A);

        if(flag){
            System.out.println("Stable");
        }else{
            System.out.println("Not stable");
        }

        for(int i=0;i<n;i++){
            System.out.println(A[i].symbol + " " + A[i].num);
            /*if(i != A.length-1){
                System.out.print("\n");
            }*/
        }
    }

    public static boolean judge(Cards[]A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(A[i].num == A[j].num && A[i].index > A[j].index){
                    return false;
                }
            }
        }
        return true;
    }

    public static int partition(Cards[]A,int p,int r){
        int x = A[r].num;
        int i= p -1;
        for(int j= p;j<r;j++){
            if(A[j].num <= x){
                i++;
                int tmp = A[i].num;
                A[i].num = A[j].num;
                A[j].num = tmp;

                char ss = A[i].symbol;
                A[i].symbol = A[j].symbol;
                A[j].symbol = ss;
            }
        }

        int change = A[r].num;
        A[r].num = A[i+1].num;
        A[i+1].num = change;

        char sc = A[r].symbol;
        A[r].symbol = A[i+1].symbol;
        A[i+1].symbol = sc;
        
        return i+1;
    }

    public static void quicks(Cards[]A,int p,int r){
        if(p < r){
            int q = partition(A,p,r);
            quicks(A,p,q-1);
            quicks(A,q+1,r);
        }
    }
}
