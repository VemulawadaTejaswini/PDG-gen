import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        char[] ch = sc.next().toCharArray();
        boolean flag = false;
        int sum=0;
        for (int i = ch.length - 1; i >= 1; i--) {
            if(ch[i]!='9'){
                flag=true;
            }
            sum+=9;
        }
        sum+=(ch[0]-'0');
        if(flag){
            sum--;
        }
        System.out.println(sum);
    }
}
