import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner Weather=new Scanner(System.in);

        String str0=Weather.nextLine();


        String str1="Sunny";
        String str2="Cloudy";
        String str3="Rainy";

        //System.out.println("0"+str0);
        //System.out.println("1"+str1);
        //System.out.println("2"+str2);
        //System.out.println("3"+str3);


        if(str0.equals(str1)){
            System.out.println("Cloudy");
        }if(str0.equals(str2)){
            System.out.println("Rainy");
        }if(str0.equals(str3)){
            System.out.println("Sunny");
        }
    }
}