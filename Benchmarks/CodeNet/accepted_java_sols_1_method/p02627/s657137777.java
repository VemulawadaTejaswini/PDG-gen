import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = a.toLowerCase();
        if(a.equals(b)){
            System.out.println("a");
        }else{
            System.out.println("A");
        }
    } 
}