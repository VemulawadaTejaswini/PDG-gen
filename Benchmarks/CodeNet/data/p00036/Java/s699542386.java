import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        String plane = "",str="";
        int row = 0;
        Scanner scan = new Scanner(System.in);
        
        while(scan.hasNext()){
            str = scan.next();
            plane += str;
            if(row++ > 6){
                row = 0;
                if(plane.matches(".*1111.*"))System.out.println("C");
                else if(plane.matches(".*110000011.*"))System.out.println("G");
                else if(plane.matches(".*1100000011.*"))System.out.println("A");
                else if(plane.matches(".*11000000011.*"))System.out.println("E");
                else if(plane.matches(".*1000000110000001.*"))System.out.println("D");
                else if(plane.matches(".*100000001100000001.*"))System.out.println("F");
                else if(plane.matches(".*1000000010000000100000001.*"))System.out.println("B");
                plane = "";
            }
        }
    }
}

