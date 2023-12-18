import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     
        //BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
        String str=br.readLine();
        String[] st=str.split(" ");
        str=br.readLine();
        Dice dice1 =new Dice(st);
        dice1.roll(str);
        System.out.println(dice1.getd1());
    }
    }
class Dice{
 
String d1,d2,d3,d4,d5,d6;
 
    Dice(String[] s){
        d1=s[0];
        d2=s[1];
        d3=s[2];
        d4=s[3];
        d5=s[4];
        d6=s[5];
    }
         
    void roll(String s){
        String top,bot,back,front,left,right;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
        top=d1;
        bot=d6;
        front=d2;
        back=d5;
        left=d4;
        right=d3;
        switch(c){
        case 'N':
            top=d2;
            bot=d5;
            front=d6;
            back=d1;
            break;
         
        case 'S':
            top=d5;
            bot=d2;
            front=d1;
            back=d6;
            break;
        case 'W':
            top=d3;
            bot=d4;
            right=d6;
            left=d1;break;
         
        case 'E':
            top=d4;
            bot=d3;
            right=d1;
            left=d6;
            break;
        }
        d1=top;
        d2=front;
        d3=right;
        d4=left;
        d5=back;
        d6=bot;
         
    }}
    String getd1(){return d1;}
}
