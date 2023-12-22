import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args) throws Exception{
        String str[];
        int a, b;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine().split(" ");
        a = Integer.parseInt(str[0]);
        b = Integer.parseInt(str[1]);

        if(a < b){
        	System.out.println("a < b");
        }else if(a > b){
        	System.out.println("a > b");
        }else if(a == b){
        	System.out.println("a == b");
        }
    }
}