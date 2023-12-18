

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Blulogix
 */
public class Main{
    public static void main(String[] args)throws Exception {
       Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        
      String out=a+""+b;
      double output=Math.sqrt(Integer.parseInt(out));
      int out1=(int)output;
      if(output==out1){
          System.out.println("Yes");
      }else{
          System.out.println("No");
      }
    }
}
