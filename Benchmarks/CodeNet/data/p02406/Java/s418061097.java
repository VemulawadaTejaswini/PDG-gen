import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int x = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        Check chk = new Check();
        x = sc.nextInt();
        for(int i=1;i<x+1;i++){
            if(chk.check3X(i)){
                str += Integer.toString(i) + " ";
            }else if(chk.has3(i)){
                str += Integer.toString(i) + " ";
            }
        }
        System.out.println(str.trim());

    }
}

class Check{
    boolean check3X(int a){
        if(a%3==0){
            return true;
        }
        return false;
    }

    boolean has3(int a){
        if(a-(a/10)*10==3){
            return true;
        }
        return false;
    }
}