import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String[]args){
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      	Scanner scan = new Scanner(System.in);
      	int a,b;
        try{
            a = scan.nextInt();
          	b = scan.nextInt();
        }catch(Exception e){
          	a = 0;
          	b = 0;
        }
        System.out.print(a*b + " ");
        System.out.print((a+b)*2);
        System.out.println();
    }
}
