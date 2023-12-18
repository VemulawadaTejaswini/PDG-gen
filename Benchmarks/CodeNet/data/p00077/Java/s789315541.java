import java.util.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static char[] input;
    public static void main(String[] args) {
        while(read()){
            solve();
        }

    }

    static boolean read(){
        if(!sc.hasNext())return false;
        input = sc.next().toCharArray();
        return true;
    }

    static void solve(){
        StringBuffer sb = new StringBuffer();
        int index = 0;
        while( index < input.length){
            if(input[index] == '@'){
                int count = input[++index] - '0';
                index++;
                for(int i = 0; i < count; i++){
                    sb.append(input[index]);
                }
            }else{
                sb.append(input[index]);
            }
            index++;
        }
        System.out.println(sb);
    }

}