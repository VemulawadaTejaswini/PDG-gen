import java.io.*;
import java.util.*;
 
class Main{
    public static void main(String[] args){
    BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
    try {
        String st;
        while((st=sc.readLine())!=null){
        String[] sp = st.split(" ");
        System.out.println(Integer.valueOf(sp[0])+Integer.valueOf(sp[1]));
        }
    }catch(Exception e){
        System.out.println("Error");
    }
    }
}