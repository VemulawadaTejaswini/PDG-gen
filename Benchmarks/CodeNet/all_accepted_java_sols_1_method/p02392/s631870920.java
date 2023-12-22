import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
     int b=sc.nextInt();
     int c = sc.nextInt();
     if (a< b){ if (b<c){
         System.out.println("Yes");
     } else {
         System.out.println("No");
     }   }else{System.out.println("No");}
     
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //String line = br.readLine();
    }
}

