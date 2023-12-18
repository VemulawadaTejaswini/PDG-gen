import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        boolean flag = false;

//      n????????????????????????????????????
        for(int i=0;i<n;i++){
            str[i] = br.readLine();
        }

        label:for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                flag = Dice.checkSame(str[i], str[j]);
                if(flag == true) break label;
            }
        }
        if(flag){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}

class Dice{
    private String[] str;
    private String tmp;

    Dice(String str){
        this.str = new String[6];
        this.str = str.split(" ");
    }
    public String getNum(int n){
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

    static boolean checkSame(String dice1Str, String dice2Str){
        Dice dice1 = new Dice(dice1Str);
        Dice dice2 = new Dice(dice2Str);
        int i,j,count=0;
        boolean check = false;
        String str = "";
        for(i=0;i<6;i++){
            if(dice1.getNum(0).equals(dice2.getNum(i))){
                count++;
                str += String.valueOf(i);
            }
        }
        label:for(i=0;i<count;i++){
            dice2 = new Dice(dice2Str);
            switch(Integer.parseInt(str.substring(i,i+1))){
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
            int count2 = 0;
            String str2 = "";
            for(j=1;j<5;j++){
                if(dice1.getNum(1).equals(dice2.getNum(j))){
                    count2++;
                    str2 += String.valueOf(j);
                }
            }
            if(count2 != 0){
                for(int k=0;k<count2;k++){
                    switch(Integer.parseInt(str2.substring(k,k+1))){
                        case 1:
                            if(dice1.getNum(2).equals(dice2.getNum(2)) &&
                               dice1.getNum(3).equals(dice2.getNum(3)) &&
                               dice1.getNum(4).equals(dice2.getNum(4)) &&
                               dice1.getNum(5).equals(dice2.getNum(5))){
                                check = true;
                                break label;
                            }
                            break;
                        case 2:
                            if(dice1.getNum(2).equals(dice2.getNum(4)) &&
                               dice1.getNum(3).equals(dice2.getNum(1)) &&
                               dice1.getNum(4).equals(dice2.getNum(3)) &&
                               dice1.getNum(5).equals(dice2.getNum(5))){
                                check = true;
                                break label;
                            }
                            break;
                        case 3:
                            if(dice1.getNum(2).equals(dice2.getNum(1)) &&
                               dice1.getNum(3).equals(dice2.getNum(4)) &&
                               dice1.getNum(4).equals(dice2.getNum(2)) &&
                               dice1.getNum(5).equals(dice2.getNum(5))){
                                check = true;
                                break label;
                            }
                            break;
                        case 4:
                            if(dice1.getNum(2).equals(dice2.getNum(3)) &&
                               dice1.getNum(3).equals(dice2.getNum(2)) &&
                               dice1.getNum(4).equals(dice2.getNum(1)) &&
                               dice1.getNum(5).equals(dice2.getNum(5))){
                                check = true;
                                break label;
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
        }
        return check;
    }

}