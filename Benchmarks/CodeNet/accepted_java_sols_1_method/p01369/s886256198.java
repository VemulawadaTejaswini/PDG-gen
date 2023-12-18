
import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Reopard on 2014/05/27.
 */


public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        int count;
        boolean left;
        String line;
        char[] tmp;
        Character[] qwert = {'q','w','e','r','t',
                             'a','s','d','f','g',
                             'z','x','c','v','b'};
        /*Character[] yuiop = {'y','u','i','o','p',
                             'h','j','k','l',
                             'n','m'};*/
        while(!(line = sc.next()).equals("#")){
            count = 0;
            tmp = line.toCharArray();
            left = Arrays.asList(qwert).contains(tmp[0]);
            for(int i = 1; i < tmp.length; i++){
                if(Arrays.asList(qwert).contains(tmp[i])){
                    if(!left){
                        left = true;
                        count++;
                    }
                }else{
                    if(left){
                        left = false;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}