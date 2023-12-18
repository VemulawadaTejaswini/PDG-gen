import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean check = false;
        int i;
        Dice dice1 = new Dice(br.readLine());
        Dice dice2 = new Dice(br.readLine());
        for(i=0;i<6;i++){
            if(dice1.getStr(0).equals(dice2.getStr(i))) break;
        }
        switch(i){
            case 1:
                dice2.moveN();
                break;
            case 2:
                dice2.moveW();
                break;
            case 3:
                dice2.moveE();
                break;
            case 4:
                dice2.moveS();
                break;
            case 5:
                dice2.moveN();
                dice2.moveN();
                break;
            case 0:
            default:
                break;
        }
        for(i=1;i<5;i++){
            if(dice1.getStr(1).equals(dice2.getStr(i))){
                check = true;
                break;
            }
        }
        if(!check){
            System.out.println("No");
        }else{
            switch(i){
                case 1:
                    if(!dice1.getStr(2).equals(dice2.getStr(2)) || 
                       !dice1.getStr(3).equals(dice2.getStr(3)) || 
                       !dice1.getStr(4).equals(dice2.getStr(4)) ||     
                       !dice1.getStr(5).equals(dice2.getStr(5))){
                        check = false;
                    }
                    break;
                case 2:
                    if(!dice1.getStr(2).equals(dice2.getStr(4)) || 
                       !dice1.getStr(3).equals(dice2.getStr(1)) || 
                       !dice1.getStr(4).equals(dice2.getStr(3)) ||     
                       !dice1.getStr(5).equals(dice2.getStr(5))){
                        check = false;
                    }
                    break;
                case 3:
                    if(!dice1.getStr(2).equals(dice2.getStr(1)) || 
                       !dice1.getStr(3).equals(dice2.getStr(4)) || 
                       !dice1.getStr(4).equals(dice2.getStr(2)) ||     
                       !dice1.getStr(5).equals(dice2.getStr(5))){
                        check = false;
                    }
                    break;
                case 4:
                    if(!dice1.getStr(2).equals(dice2.getStr(3)) || 
                       !dice1.getStr(3).equals(dice2.getStr(2)) || 
                       !dice1.getStr(4).equals(dice2.getStr(1)) ||     
                       !dice1.getStr(5).equals(dice2.getStr(5))){
                        check = false;
                    }
                    break;
                default:
                    break;
            }
            if(check){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}

class Dice{
    private String str[];//0=top,1=front,2=right,3=left,4=back,5=bottom
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