import java.io.*;

class Main{
    

    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {       
                    String line1 = reader.readLine();
                    int x = Integer.parseInt(line1);
                    String line = reader.readLine();
                    String[] strAry = line.split(" ");

                    int[] a = new int[x];
			
			for (int i = 0;i < strAry.length; i++){
				a[i] = Integer.parseInt(strAry[i]);
            }
            
            for(int i = 0; i < x; i++){
                for(int k = 0; k < i; k++){
                    if(a[i] < a[k]){
                        int kara = a[i];
                        for(int j = 0; j < (i - k); j++){
                            a[i - j] = a[i - j - 1];
                        }
                        a[k] = kara;
                    } 
                }
                System.out.print(a[0]);
                for(int l = 1; l < x; l++){
                    System.out.print(" " + a[l]);
                }
                System.out.println();
            }

            
                            
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}