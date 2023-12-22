import java.util.*;
//import java.math.BigInteger;
 
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] a = new int[4];
        a[0] = str.charAt(0)-48;
        a[1] = str.charAt(1)-48;
        a[2] = str.charAt(2)-48;
        a[3] = str.charAt(3)-48;
        
        if((a[0]+a[1]+a[2]+a[3])==7){
            System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
        }else if((a[0]-a[1]+a[2]+a[3])==7){
            System.out.println(a[0]+"-"+a[1]+"+"+a[2]+"+"+a[3]+"=7");
        }else if((a[0]+a[1]-a[2]+a[3])==7){
            System.out.println(a[0]+"+"+a[1]+"-"+a[2]+"+"+a[3]+"=7");
        }else if((a[0]+a[1]+a[2]-a[3])==7){
            System.out.println(a[0]+"+"+a[1]+"+"+a[2]+"-"+a[3]+"=7");
        }else if((a[0]-a[1]-a[2]+a[3])==7){
            System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"+"+a[3]+"=7");
        }else if((a[0]-a[1]+a[2]-a[3])==7){
            System.out.println(a[0]+"-"+a[1]+"+"+a[2]+"-"+a[3]+"=7");
        }else if((a[0]+a[1]-a[2]-a[3])==7){
            System.out.println(a[0]+"+"+a[1]+"-"+a[2]+"-"+a[3]+"=7");
        }else if((a[0]-a[1]-a[2]-a[3])==7){
            System.out.println(a[0]+"-"+a[1]+"-"+a[2]+"-"+a[3]+"=7");
        }
    }
}