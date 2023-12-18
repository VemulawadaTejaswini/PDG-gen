import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        

        while(true){
            char[] c = new char[1200];
            int[] flag = new int[1200];
            String str;
            int Flag = 0, error = 0;

            str = br.readLine();
            int l = str.length();

            for(int i = 0; i<l; i++){
                c[i] = str.charAt(i);

                if(l == 1 && c[0] == 46) break;
                //System.out.println(c[i]);
                
                if(c[i] == 40){ 
                    flag[i] = 1;
                }else if(c[i] == 41) {
                    flag[i] = 2;

                    for(int j = i-1; j >= 0; j--){
                        
                        if(flag[j] == 3){
                            error = 1;
                            break;
                        }else if(flag[j] == 1){
                            flag[j] = 0;
                            flag[i] = 0;
                            break;
                        }
                    }

                }else if(c[i] == 91){
                     flag[i] = 3;
                }else if(c[i] == 93){
                    flag[i] = 4;

                    for(int j = i-1; j >= 0; j--){

                        if(flag[j] == 1){
                            error = 1;
                            break;
                        }else if(flag[j] == 3){
                            flag[j] = 0;
                            flag[i] = 0;
                            break;
                        }
                    }
                }else{
                    flag[i] = 0;
                }
                //System.out.println(flag[i]);
                if(error == 1) break;
            }
            

            if(l == 1 && c[0] == 46) break;

            for(int i = 0; i < l; i++){
                if(flag[i] != 0){
                    Flag = 1;
                }
                //System.out.println(flag[i]);
                //System.out.println(Flag);
            }

            if(Flag == 0 && error == 0){
                System.out.println("yes");
            }else if(Flag == 1 || error == 1){
                System.out.println("no");
            }
        }

   
    }
}
