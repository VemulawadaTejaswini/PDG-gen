
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int xc = sc.nextInt();
        int yc = sc.nextInt();
        for(int y=0;y<H;y++){
            String str = "";
            for(int x=0;x<W;x++){
                if(y<yc){
                    if(x<xc){
                        str+="0";
                    }else{
                        str+="1";
                    }
                }else{                    
                    if(x<xc){
                        str+="1";
                    }else{
                        str+="0";
                    }
                }
            }
            System.out.println(str);
        }
    }
}