import java.lang.*;
import java.util.*;

interface Robot{
    void make_mountain(int p);
    void push(int p, String c);
    void pop(int p);
    void move(int p1, int p2);
}

class Stacking implements Robot{
    private char[][] mountain;

    public void make_mountain(int p){
        mountain = new char[p][1000];
        for(char[] is: mountain){
            Arrays.fill(is, '0');
        }
    }
    public void push(int p, String c){
        char[] is = mountain[p-1];
        for(int i=0; i<1000; i++){
            if(is[i]=='0'){
                is[i] = c.charAt(0);
                break;
            }
        }
    }
    public void pop(int p){
        char[] is = mountain[p-1];
        for(int i=0; i<1000; i++){
            if(is[i+1]=='0' && is[i]!='0'){
                System.out.println(is[i]);
                is[i] = '0';
                break;
            }
        }
    }
    public void move(int p1, int p2){
        char k = '0';
        char[] is = mountain[p1-1];
        for(int i=0; i<1000; i++){
            if(is[i+1]=='0' && is[i]!='0'){
                k = is[i];
                is[i] = '0';
                break;
            }
        }
        is = mountain[p2-1];
        for(int i=0; i<1000; i++){
            if(is[i]=='0'){
                is[i] = k;
                break;
            }
        }
    }
}

class IOAndRun{
    Robot rob;

    public void Run(){
        String argv0;
        Scanner argvs = new Scanner(System.in);
        rob.make_mountain(argvs.nextInt());
        while(true){
            argvs = new Scanner(System.in);
            argv0 = argvs.next();
            if(argv0.equals("push")) rob.push(argvs.nextInt(), argvs.next());
            else if(argv0.equals("pop")) rob.pop(argvs.nextInt());
            else if(argv0.equals("move")) rob.move(argvs.nextInt(), argvs.nextInt());
            else if(argv0.equals("quit")) break;
        }
    }
}

public class SRII{
    public static void main(String[] args){
        IOAndRun r = new IOAndRun();
        r.rob = new Stacking();
        r.Run();
    }
}