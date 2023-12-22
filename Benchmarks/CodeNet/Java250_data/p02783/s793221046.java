import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int h=scan.nextInt(),a=scan.nextInt(),total=0;
        while (h>0){
      		h-=a;
      		total+=1;}
      System.out.println(total);
        }
    }
