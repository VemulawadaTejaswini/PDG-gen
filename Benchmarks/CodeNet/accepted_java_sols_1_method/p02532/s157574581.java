import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int num = Integer.parseInt(in.readLine());
        StringBuffer[] li = new StringBuffer[num];
        for(int i=0; i<num; i++){
            li[i] = new StringBuffer();
        }

        int arr, arr2;
        while(true){
            String[] str = in.readLine().split(" ");
            if     (str[0].equals("push") == true){
                arr = Integer.parseInt(str[1]);
                li[arr - 1].append(str[2].charAt(0));
            }
            else if(str[0].equals("pop")  == true){
                arr = Integer.parseInt(str[1]);
                sb.append(li[arr - 1].charAt(li[arr - 1].length() - 1) + "\n");
                li[arr - 1].deleteCharAt(li[arr - 1].length() - 1);
            }
            else if(str[0].equals("move") == true){
                arr = Integer.parseInt(str[1]);
                arr2 = Integer.parseInt(str[2]);
                char ch = li[arr - 1].charAt(li[arr - 1].length() - 1);
                li[arr - 1].deleteCharAt(li[arr - 1].length() - 1);
                li[arr2 - 1].append(ch);
            }
            else break;
        }

        System.out.print(sb);
        in.close();
    }
}