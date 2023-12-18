//package  com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       int val=number/1000;
       if(number%1000!=0){
           val+=1;
       }else{

       }
        System.out.println(1000*val-number);
    }
}