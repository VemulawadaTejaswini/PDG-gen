import java.io.*;
class Program{
    boolean fact(int n){
        int count = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
            if (n%i==0){
                if (i!=Math.sqrt(n)) count+=2;
                else{
                    if (Math.pow(Math.sqrt(n),2)==n) count+=1;
                    else count+=2;
                }
            }
        }
        if (count==8) return true;
        else return false;
    }
}
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Program obj = new Program();
        int count= 0, N = Integer.parseInt(in.readLine());
        for(int i = 1;i<=N;i++){
            if(i%2==1){
                if(obj.fact(i)) count++;
            }
        }
        System.out.println(count);
    }
}