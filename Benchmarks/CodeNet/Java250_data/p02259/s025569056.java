import java.io.*;

class Main{
    
        public static int maxv(int x, int y){
            if(x >= y){
                return x;
            }else{
                return y;
            }
        }

        public static int minv(int x, int y){
            if(x <= y){
                return x;
            }else{
                return y;
            }
        }

    public static void main(String[] args){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                int N = Integer.parseInt(reader.readLine());;
		    	String line = reader.readLine();
			    String[] strAry = line.split(" ");
                
			    int[] a = new int[N];
			
			    for (int i = 0;i < N; i++){
				    a[i] = Integer.parseInt(strAry[i]);
			    }

                int count = 0;

                while(true){
                    int v = 0;
                    for(int i = 0; i < (N -1); i++){
                        if(a[i + 1] < a[i]){
                            int k = a[i];
                            a[i] = a[i+1];
                            a[i + 1] = k;
                            count += 1;
                            v = 1;
                        }
                    }

                    if(v == 0){
                        break;
                    }
                }
            
                for(int i = 0; i < N; i++){
                    System.out.print(a[i]);
                    if(i != (N - 1)){
                        System.out.print(" ");
                    }
                }
                System.out.println();

                System.out.println(count);
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}