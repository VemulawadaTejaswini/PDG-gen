import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        resultCheck rc = new resultCheck();
        Scanner sc = new Scanner(System.in);
        while(true){
            int tyukanTest  = sc.nextInt();
            int kimatsuTest = sc.nextInt();
            int againTest   = sc.nextInt();
            if(tyukanTest == -1 && kimatsuTest == -1 && againTest == -1){
                break;
            }
            System.out.println(rc.judgeTest(tyukanTest, kimatsuTest, againTest));
        }
    }
}

class resultCheck{
    public String judgeTest(int tyukanTest, int kimatsuTest, int againTest){
        if(tyukanTest == -1 || kimatsuTest == -1){
            tyukanTest = 0;
            kimatsuTest = 0;
        }
        if(tyukanTest + kimatsuTest >= 80){
            return "A";
        }
        else if(tyukanTest + kimatsuTest >= 65){
            return "B";
        }
        else if(tyukanTest + kimatsuTest >= 50){
            return "C";
        }
        else if(againTest >= 50){
            return "C";
        }
        else if(tyukanTest + kimatsuTest >= 30){
            return "D";
        }
        else{
            return "F";
        }
    }
}
