import java.util.Scanner;

class Main{
public static void main(String[] args){

 int a;
 int hou;
 int min;
 int sec;
Scanner s = new Scanner(System.in);
    a=s.nextInt();
    hou=a/3600;
    min=a%3600/60;
    sec=a%3600%60;


System.out.println(hou+":"+min+":"+sec);}

}
