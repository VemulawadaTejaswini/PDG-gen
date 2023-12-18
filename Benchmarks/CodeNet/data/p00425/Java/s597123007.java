import java.util.*;
import java.io.*;
class Main{
    static char[] dice;
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         
        try{
                while(true){
                    String line = reader.readLine();
                    int n = Integer.parseInt(line);
                    if(n==0)break;
                    int sum = 1;
                    dreset();
 
                    for(int i = 0;i < n;++i){
                        line = reader.readLine();
                        sum += move(line.charAt(0));
                        //System.out.println(sum);
                    }
                    System.out.println(sum);
                }   
                 
        }catch(IOException e){
                System.out.println(e);
        }
    }
 
    public static void dreset(){
        dice = new char[7];
        dice[1] = 'T';
        dice[2] = 'S';
        dice[3] = 'E';
        dice[4] = '0';
        dice[5] = '0';
        dice[6] = '0';
    }
 
    public static int move(char direct){
        int t=0,s=0,e=0;
        switch(direct){
            case 'N':
                for(int i = 1; i < 7;++i){
                    if(dice[i]=='T'){
                        t = i;break;
                    }
                }
                for(int i = 1; i < 7;++i){
                    if(dice[i]=='S'){
                        dice[i]='T';
                        dice[7-i]=dice[t]='0';
                        dice[7-t]='S';
                        return i;
                    }
                }
                break;
            case 'E':
                for(int i = 1; i < 7;++i){
                    if(dice[i]=='T'){
                        t = i;break;
                    }
                }
                //for(int i = 1; i<7;++i)System.out.println(dice[i]);
                for(int i = 1; i < 7;++i){
                    if(dice[7-i]=='E'){
                        dice[i]='T';
                        dice[7-i]=dice[7-t]='0';
                        dice[t]='E';
                        return i;
                    }
                }
                break;
            case 'W':
                for(int i = 1; i < 7;++i){
                    if(dice[i]=='T'){
                        t = i;break;
                    }
                }
                for(int i = 1; i < 7;++i){
                    if(dice[i]=='E'){
                        dice[i]='T';
                        dice[7-i]=dice[t]='0';
                        dice[7-t]='E';
                        return i;
                    }
                }
                break;
            case 'S':
                for(int i = 1; i < 7;++i){
                    if(dice[i]=='T'){
                        t = i;break;
                    }
                }
                //for(int i = 1;i < 7;++i)System.out.println(dice[i]);
                for(int i = 1; i < 7;++i){
                    if(dice[7-i]=='S'){
                        dice[i]='T';
                        dice[7-i]=dice[7-t]='0';
                        dice[t]='S';
                        return i;
                    }
                }
                break;
            case 'R':
                for(int i = 1;i < 7;++i){
                    if(dice[i]=='E'){
                        e = i;
                    }
                    if(dice[i]=='T'){
                        t = i;
                    }
                }
                for(int i = 1;i < 7;++i){
                    if(dice[i]=='S'){
                        dice[i]=dice[7-e]='0';
                        dice[7-i]='E';
                        dice[e]='S';
                        return t;
                    }
                }
                break;
            case 'L':
                for(int i = 1;i < 7;++i){
                    if(dice[i]=='S'){
                        s = i;
                    }
                    if(dice[i]=='T'){
                        t = i;
                    }
                }
                for(int i = 1;i < 7;++i){
                    if(dice[i]=='E'){
                        dice[i]=dice[7-s]='0';
                        dice[7-i]='S';
                        dice[s]='E';
                        return t;
                    }
                }
                break;
            default:
                System.out.println("ERROR HAS OCCURED");
        }
        return 0;
    }
}