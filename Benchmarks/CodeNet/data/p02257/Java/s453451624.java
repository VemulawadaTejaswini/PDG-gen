import java.io.*;

class Main{
    
        public static int prime(int x){
            int k = 0;
            if(x == 1){
                k = 1;
            }else if(x % 2 == 0){
                k = 1;
            }
            for(int i = 3; i <= Math.sqrt(x); i += 2){
                if (x % i == 0){
                    k = 1;
                    break;
                }
            }
            if(x == 2){
                k = 0;
            }
                return k;
        }

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    int N = Integer.parseInt(reader.readLine());;
                    

                    int[] a = new int[N];

                    for(int i = 0; i < N; i ++){
                        a[i] = Integer.parseInt(reader.readLine());
                    }

                    int count = 0;

                    for(int i = 0; i < a.length; i++){
                        if(prime(a[i]) == 0){
                            count += 1;
                        }
                    }

                    System.out.println(count);
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}