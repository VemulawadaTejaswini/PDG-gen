import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] inputList = input.split(" ");

        Integer[] Agrp = {1, 3, 5, 7, 8, 10, 12};
        Integer[] Bgrp = {4, 6, 9, 11};
        Integer[] Cgrp = {2};

        if(Arrays.asList(Agrp).contains(Integer.parseInt(inputList[0]))){
            if(Arrays.asList(Agrp).contains(Integer.parseInt(inputList[1]))){
                System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
        }else if(Arrays.asList(Bgrp).contains(Integer.parseInt(inputList[0]))){
        	if(Arrays.asList(Bgrp).contains(Integer.parseInt(inputList[1]))){
                System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
        }else if(Arrays.asList(Cgrp).contains(Integer.parseInt(inputList[0]))){
        	if(Arrays.asList(Cgrp).contains(Integer.parseInt(inputList[1]))){
                System.out.println("Yes");
            }else{
            	System.out.println("No");
            }
        }
        else{
        	System.out.println("No");
        }
    }
}