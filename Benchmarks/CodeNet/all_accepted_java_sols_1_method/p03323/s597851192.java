import java.util.*;
import java.lang.*;
import java.io.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt(),b=in.nextInt();
        if(a+b>16 || a>8 || b>8){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }

    }

}