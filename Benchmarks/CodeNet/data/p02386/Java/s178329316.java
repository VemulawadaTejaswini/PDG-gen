import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
 
class Main {
    public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
     
     // BufferedReader br=new BufferedReader(new FileReader("sample.txt"));
        int n=Integer.parseInt(br.readLine());
        Dice[] dice=new Dice[n];
        for(int i=0;i<n;i++){
        dice[i] =new Dice(br.readLine());
        }boolean con=false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(con=dice[i].equals(dice[j]))break;
            }if(con)break;
        }System.out.println(con?"No":"Yes");
     
         
         
    }
    }
class Dice{
 
String top,front,right,left,back,bot;
 
    Dice(String str){
        String[] s=str.split(" ");
        top=s[0];
        front=s[1];
        right=s[2];
        left=s[3];
        back=s[4];
        bot=s[5];
    }
    boolean equals(Dice d){
        for(int i=0;i<6;i++){
            if(front.equals(d.front))break;
            if(i==3)roll('E');
            roll('N');
        }
        for(int i=0;i<3;i++){
            if(top.equals(d.top))break;
            roll('W');
        }
        return back.equals(d.back) && bot.equals(d.bot)&&top.equals(d.top)&&front.equals(d.front)
					&& left.equals(d.left) && right.equals(d.right);
    }
         
    void roll(char c){
        String top,bot,back,front,left,right;
         
        top=this.top;bot=this.bot;
        front=this.front;
        back=this.back;
        left=this.left;
        right=this.right;
         
        switch(c){
        case 'N':
            top=this.front;
            bot=this.back;
            front=this.bot;
            back=this.top;
            break;
         
        case 'S':
            top=this.back;
            bot=this.front;
            front=this.top;
            back=this.bot;
            break;
        case 'W':
            top=this.right;
            bot=this.left;
            right=this.bot;
            left=this.top;break;
         
        case 'E':
            top=this.left;
            bot=this.right;
            right=this.top;
            left=this.bot;
            break;
        }
        this.top=top;
        this.front=front;
        this.right=right;
        this.left=left;
        this.back=back;
        this.bot=bot;}}