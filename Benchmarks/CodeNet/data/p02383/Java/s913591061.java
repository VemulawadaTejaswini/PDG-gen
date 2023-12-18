import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String str = br.readLine();
        Dice d = new Dice(line.split(" "));
        d.roll(str);
        System.out.println(d.getTop());
    }
}
class Dice
{
    int top,bottom,front,back,left,right;
    Dice(String s[]){
        top=Integer.parseInt(s[0]);
        bottom=Integer.parseInt(s[5]);
        front=Integer.parseInt(s[1]);
        left=Integer.parseInt(s[3]);
        right=Integer.parseInt(s[2]);
        back=Integer.parseInt(s[4]);
    }
    void roll(String s) {
        char ord=0;
        for(int i=0;i<s.length();i++) {
            ord=s.charAt(i);
        int tmp;
        switch(ord) {
            case'N':
                tmp=top;
                top=front;
                front=bottom;
                bottom=back;
                back=tmp;
                break;
            case'E':
                tmp=top;
                top=left;
                left=bottom;
                bottom=right;
                right=tmp;
                break;
            case'W':
                tmp=top;
                top=right;
                right=bottom;
                bottom=left;
                left=tmp;
                break;
            case'S':
                tmp=top;
                top=back;
                back=bottom;
                bottom=front;
                front=tmp;
                break;
            default:break;
        }
        }
    }
    public int getTop() {
        return top;
    }
}