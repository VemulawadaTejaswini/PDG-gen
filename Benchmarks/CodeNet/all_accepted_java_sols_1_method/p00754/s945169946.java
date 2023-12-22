

import java.util.Scanner;

/**
 * Created by Reopard on 2014/06/05.
 */
public class Main{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        String line;
        int p;
        char[] sentence;
        outer:
        while(!(line = sc.nextLine()).equals(".")){
            char[] check_stack = new char[200];
            p = 1;
            sentence = line.toCharArray();
            while(true){
                for(char tmp : sentence){
                    switch(tmp){
                        case '(':
                            check_stack[p++] = '(';
                            break;
                        case ')':
                            if(check_stack[--p] != '('){
                                System.out.println("no");
                                continue outer;
                            }
                            break;
                        case '[':
                            check_stack[p++] = '[';
                            break;
                        case ']':
                            if(check_stack[--p] != '['){
                                System.out.println("no");
                                continue outer;
                            }
                            break;
                        case '.':
                            if(p == 1) System.out.println("yes");
                            else System.out.println("no");
                            continue outer;
                        default:
                            break;
                    }
                }
                line = sc.nextLine();
                sentence = line.toCharArray();
            }
        }
    }
}