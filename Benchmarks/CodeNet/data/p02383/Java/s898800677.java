import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Y
 */

class saikoro{
    String a[];
    saikoro(String a){
        this.a = new String[6];
        this.a = a.split(" ");
    }
    
    void N(){
        this.a[0] = a[2]; this.a[2] = a[6]; this.a[3] = a[3];
        this.a[4] = a[4]; this.a[5] = a[1]; this.a[6] = a[5];
    }
    void S(){
        this.a[1] = a[5]; this.a[2] = a[1]; this.a[3]= a[3];
        this.a[4] = a[4]; this.a[5] = a[6]; this.a[6] = a[2];
    }
    void W(){
        this.a[1] = a[3]; this.a[2] = a[2]; this.a[3] = a[6];
        this.a[4] = a[1]; this.a[5] = a[5]; this.a[6] = a[4];
    }
    void E(){
        this.a[1] = a[4]; this.a[2] = a[2]; this.a[3] = a[1];
        this.a[4] = a[6]; this.a[5] = a[5]; this.a[6] = a[3];
    }
    String getS(int n){
        return this.a[n];
    }
}

public class Dice1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        saikoro d = new saikoro(str);
        str = br.readLine();
        
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            switch(c){
                case 'N':
                    d.N();
                    break;
                case'S':
                    d.S();
                    break;
                case 'W':
                    d.W();
                    break;
                case 'E':
                    d.E();
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(d.getS(0));
    }
}