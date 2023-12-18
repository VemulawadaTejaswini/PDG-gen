import java.io.*;

class Main{
        static boolean isPrime(int r){
                if(r<2)
                        return false;
                else if(r == 2)
                        return true;
                else if(r%2 ==0)
                        return false;
                for(int i=3; i*i<=r; i+=2)
                        if(r%i == 0)
                                return false;
                return true;
        }

        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int N = Integer.parseInt(br.readLine());
                int i = 0;
                int count = 0;
                boolean isPrime = false;
                while(i<N){
                        int r = Integer.parseInt(br.readLine());
                        if(isPrime(r))
                                count++;
                        i++;
                }
                System.out.println(count);
        }
}