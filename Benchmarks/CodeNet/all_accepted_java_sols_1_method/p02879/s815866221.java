import java.util.*;
import java.io.*;
import java.lang.*;
// ArrayList<Integer>[] arr=new ArrayList[n];
public class Main{    
public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner s = new Scanner(System.in);
         StringBuilder sb=new StringBuilder();
         BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
         int n=s.nextInt(),m=s.nextInt();
         if(n<=9&&m<=9){
            System.out.println(n*m);
         }
         else{System.out.println("-1");}
       // System.out.println(sb);
    }
}