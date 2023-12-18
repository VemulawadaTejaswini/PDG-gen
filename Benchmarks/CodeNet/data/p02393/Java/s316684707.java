import java.io.*;
import java.util.*;

class Main
{
    public static void main (String args[]) throws IOException         //?????????
    {
        InputStreamReader is = new InputStreamReader(System.in);       //?????????
        BufferedReader br = new BufferedReader(is);                    //?????????
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp_min = a;
        int tmp_mid = b;

        if(a > b){
            tmp_min = b;
            tmp_mid = a;
        }
        if(tmp_min > c){
            System.out.println(c + " " + tmp_min + " " + tmp_mid);
        }
        else if(tmp_mid < c){
            System.out.println(tmp_min + " " + tmp_mid + " " + c);
        }
        else{
            System.out.println(tmp_min + " " + c + " " + tmp_mid);
        }
    }
}
    