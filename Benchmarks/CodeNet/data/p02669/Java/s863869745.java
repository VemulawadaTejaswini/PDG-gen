import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args){
        try{
            long[] list = {0,0,0};
            long[] arg = {0,0,0,0};
            long n = 0,bigger=0,poss1=0,poss2=0;
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String temp = br1.readLine();
            long t = Integer.parseInt(temp);
            for(int i=0;i<t;i++){

                String[] temp1 = br1.readLine().split(" ");
                n = Integer.parseInt(temp1[0]);
                arg[0] = Integer.parseInt(temp1[1]);
                arg[1] = Integer.parseInt(temp1[2]);
                arg[2] = Integer.parseInt(temp1[3]);
                arg[3] = Integer.parseInt(temp1[4]);
            }
            if(n%2==0 || n%3==0 || n%5==0){
                System.out.println(core(n,list,arg));
            }
            else{
                bigger = n;
                while( bigger%2!=0 &&  bigger%3!=0 &&  bigger%5!=0)
                bigger+=1;
                poss1 = core(n,list,arg);
                bigger = n;
                while( bigger%2!=0 &&  bigger%3!=0 &&  bigger%5!=0)
                bigger-=1;
                poss2 = core(n, list, arg);
                System.out.println(Math.min(poss1,poss2));

            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static long[] cal(long n,long[] list){
        list[0] = 0;
        list[1] = 0;
        list[2] = 0;
        while(n%2!=0){
            list[0]++;
            n/=2;
        }
        while(n%3!=0){
            list[1]++;
            n/=3;
        }
        while(n%5!=0){
            list[2]++;
            n/=5;
        }
        return list;
    }

    public  static long core(long n,long[] list,long[] arg){
        cal(n,list);
        long result1 = list[0] * arg[0] + list[1] * arg[1] + list[2] * arg[2] + arg[3];
        if(result1/n>arg[3]){
            return n*arg[3];
        }
        else{
            return result1;
        }
    }
}
