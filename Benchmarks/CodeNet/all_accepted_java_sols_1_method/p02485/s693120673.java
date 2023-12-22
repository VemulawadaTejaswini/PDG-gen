import java.io.*;

public class Main{
    public static void main(String[] args){
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            while(true){
                String line = reader.readLine();
                char a = line.charAt(0);
                if(a == '0'){
                    break;
                }
                for(int i = 0;i < line.length();i++){
                    a = line.charAt(i);
                    if(a - '0' == 0){
                    }else if(a - '1' == 0){
                        sum = sum + 1;
                    }else if(a - '2' == 0){
                        sum = sum + 2;
                    }else if(a - '3' == 0){
                        sum = sum + 3;
                    }else if(a - '4' == 0){
                        sum = sum + 4;
                    }else if(a - '5' == 0){
                        sum = sum + 5;
                    }else if(a - '6' == 0){
                        sum = sum + 6;
                    }else if(a - '7' == 0){
                        sum = sum + 7;
                    }else if(a - '8' == 0){
                        sum = sum + 8;
                    }else{
                        sum = sum + 9;
                }
                }
                System.out.println(sum);
                sum = 0;
        }
        }catch(IOException e){
        }
    }
}