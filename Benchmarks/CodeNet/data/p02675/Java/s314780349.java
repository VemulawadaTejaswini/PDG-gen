package Atcoder;

import java.util.Scanner;

public class Practice {
    public  static  void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        String string = String.valueOf(num);
        int statement = Integer.parseInt(String.valueOf(string.charAt(string.length()-1)));
        if (statement==2 || statement==4 ||statement==5 ||statement==7 ||
                statement==9){
            System.out.println("hon");
        }else if(statement==0&&statement==1&&statement==6&&statement==8){
            System.out.println("pon");
        }else if(statement==3){
            System.out.println("bon");
        }
    }
}
