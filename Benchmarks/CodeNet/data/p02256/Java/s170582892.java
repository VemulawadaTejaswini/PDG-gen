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

                    int yaku = 0, k = 1;
                    for(int i = 0; i <= max(a[0] , a[1]); i++){

                        int x = a[0] % k;
                        int y = a[1] % k;
                        if((x == 0) && (y == 0)){
                            yaku = k;
                        }
                        k += 1;
                    }

                    System.out.println(yaku);
            
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}