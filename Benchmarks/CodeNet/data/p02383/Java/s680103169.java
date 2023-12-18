import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Dice dice = new Dice(str);
        str = br.readLine();    //??¢???????????????????????????

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            switch(c){
            case 'E':
                dice.moveE();
                break;

            case 'N':
                dice.moveN();
                break;

            case 'S':
                dice.moveS();
                break;

            case 'W':
                dice.moveW();
                break;
            }
        }
        System.out.println(dice.getTop(0));
    }
}

class Dice{
    private String[] str;
    private String tmp;

    Dice(String str){
        this.str = new String[6];
        this.str = str.split(" ");
    }
    public String getTop(int n){
        return this.str[n];

    }
    public void moveE(){
        tmp = this.str[0];
        this.str[0] = this.str[3];
        this.str[3] = this.str[5];
        this.str[5] = this.str[2];
        this.str[2] = tmp;
    }
    public void moveN(){
        tmp = this.str[0];
        this.str[0] = this.str[1];
        this.str[1] = this.str[5];
        this.str[5] = this.str[4];
        this.str[4] = tmp;
    }
    public void moveS(){
        tmp = this.str[0];
        this.str[0] = this.str[4];
        this.str[4] = this.str[5];
        this.str[5] = this.str[1];
        this.str[1] = tmp;
    }
    public void moveW(){
        tmp = this.str[0];
        this.str[0] = this.str[2];
        this.str[2] = this.str[5];
        this.str[5] = this.str[3];
        this.str[3] = tmp;
    }
}