import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int[] Sarray = new int[4];
      	for(int i=0;i<4;i++){
        	Sarray[i] = (S/(int)Math.pow(10,i))%10;
        }
      	boolean f = false;
      	 for(int i= 1;i<4;i++){
            if(Sarray[i-1]==Sarray[i]){
                f = true;
            }
        }
        if(f==true){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }
    }
}