import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        if(N==1){
            System.out.println(1);
        }
        if((N>1)&&(N<4)){
            System.out.println(2);
        }
        if((N>3)&&(N<8)){
            System.out.println(4);
        }
        if((N>7)&&(N<16)){
            System.out.println(8);
        }
        if((N>15)&&(N<32)){
            System.out.println(16);
        }
        if((N>31)&&(N<64)){
            System.out.println(32);
        }if(N>63){
            System.out.println(64);
        }
        }
        
        
    }
