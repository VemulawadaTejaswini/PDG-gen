import java.util.*;
import java.util.Scanner;

public class Main {// Main
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        String sample = "CODEFESTIVAL2016";

        int counter = 0;
        for(int i = 0; i < 16; i++){
          if(input.charAt(i) != sample.charAt(i)){
            counter++;
          }
        }

        System.out.println(""+counter);
    }
}