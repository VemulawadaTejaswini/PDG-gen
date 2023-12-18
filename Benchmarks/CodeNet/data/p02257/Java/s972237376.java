import java.io.*;

class Main{
    
        public static int prime(int x){
            int k = 0;
            for(int i = 2; i <= x; i++){
                if (x % i == 0){
                    k = 1;
                    break;
                }
            }
                return k;
        }

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    String line0 = reader.readLine();
                    int x = Integer.parseInt(line0);

                    int[] a = new int[10000];

                    for(int i = 0; i < x; i ++){
                        String line = reader.readLine();
                        a[i] = Integer.parseInt(line);
                    }

                    System.out.println();

                    int count = 0;

                    for(int i = 0; i < a.length; i++){
                        if(prime(a[i]) == 1){
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