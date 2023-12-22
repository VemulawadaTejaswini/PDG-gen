import java.io.*;

class Main{
    
        public static int max(int i, int k){
            if(k < i){
                return i;
            }else{
                return k;
            }

        }

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    String line = reader.readLine();
                    String[] strAry = line.split(" ");

                    int[] a = new int[strAry.length];

                    for(int i = 0; i < strAry.length; i ++){
                        a[i] = Integer.parseInt(strAry[i]);
                    }
                    int x = a[0];
                    int y = a[1];

                    if(y > x){
                        int k = y;
                        y = x;
                        x = k;
                    }

                    int yaku = 0, k = 1;
                    for(int i = 0; i <= (x % y); i++){

                        int m = x % k;
                        int n = (x % y) % k;
                        if((m == 0) && (n == 0)){
                            yaku = k;
                        }
                        k += 1;
                    }

                    if(x == y){
                        yaku = x;
                    }

                    System.out.println(yaku);
            
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}