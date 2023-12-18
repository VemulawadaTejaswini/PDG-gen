import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
//        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long N=Long.parseLong(br.readLine());
        ArrayList<Integer> arr=new ArrayList<>();
        for(long i=2;i*i<=N;++i) {
            int count=0;
            while(N%i==0) {
                N/=i;
                count++;
            }
            arr.add(count);
        }
        if(arr.size()==0)
            System.out.println(1);
        else {
            int total=0;
            for(int vals:arr) {
//                total += (int)((-1+Math.sqrt(1+8*vals))/2);
                int sum=0;
                int count=0;
                for(int i=1;i+sum<=vals;++i,count++)
                    sum+=i;
                total+=count;
            }

            System.out.println(total);
        }
    }
}