import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Dice dice = new Dice(str);
        str = br.readLine();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            switch(c){
                case 'S':
                    dice.moveS();
                    break;
                case 'W':
                    dice.moveW();
                    break;
                case 'E':
                    dice.moveE();
                    break;
                case 'N':
                    dice.moveN();
                    break;
                default:
                    break;
            }
        }
        System.out.println(dice.getStr(0));
    }
}
 
class Dice{
    private String str[];//0=???,1=???,2=???,3=???,4=??????,5=???
    private String tmp;
     
    Dice(String str) {
        this.str = new String[6];
        this.str = str.split(" ");
    }
     
    public String getStr(int n){
        return this.str[n];
    }
     
    void moveW(){
        tmp = this.str[0];
        this.str[0] = this.str[2];
        this.str[2] = this.str[5];
        this.str[5] = this.str[3];
        this.str[3] = tmp;
    }
     
    void moveE(){
        tmp = this.str[0];
        this.str[0] = this.str[3];
        this.str[3] = this.str[5];
        this.str[5] = this.str[2];
        this.str[2] = tmp;
    }
     
    void moveS(){
        tmp = this.str[0];
        this.str[0] = this.str[4];
        this.str[4] = this.str[5];
        this.str[5] = this.str[1];
        this.str[1] = tmp;
    }
     
    void moveN(){
        tmp = this.str[0];
        this.str[0] = this.str[1];
        this.str[1] = this.str[5];
        this.str[5] = this.str[4];
        this.str[4] = tmp;
    }
}