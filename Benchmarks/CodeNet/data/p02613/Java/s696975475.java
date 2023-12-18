//package  com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int tc=sc.nextInt();
       int ac=0,wa=0,tle=0,re=0;
       while(tc>0){
           //System.out.println(tc);
           String s=sc.next();
           //System.out.println(s);
           if(s.equals("AC"))ac+=1;
           else if(s.equals("WA"))wa+=1;
           else if (s.equals("TLE"))tle+=1;
           else re+=1;
           tc--;
           //System.out.println("adsf");
       }
        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
    }
}