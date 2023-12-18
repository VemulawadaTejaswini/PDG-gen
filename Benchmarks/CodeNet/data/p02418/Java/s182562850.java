package test8;

import java.util.Scanner;

class Main8D {
    public static void main(String[] args){
    	
    	//
        Scanner sc = new Scanner(System.in);
        //??????????????????
        String s = sc.nextLine();
        String p = sc.nextLine();
        
        s=s+s;
        //
        if(s.indexOf(p)!=-1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}