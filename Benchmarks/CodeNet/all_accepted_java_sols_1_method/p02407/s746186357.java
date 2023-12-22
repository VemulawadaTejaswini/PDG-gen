import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args)throws Exception{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String st = "";
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0;i <= n - 1;i++){
            int a = scan.nextInt();
            numbers.add(a);
        }
        for(int j = n - 1;j >= 0;j--){
            if(j != 0){
                st += numbers.get(j) + " ";
                
            }else{
                st += numbers.get(j);
            }
        }
        System.out.println(st);
    }
}
