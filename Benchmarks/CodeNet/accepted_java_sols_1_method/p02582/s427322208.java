import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    final Scanner sc = new Scanner(System.in);
    final List<Integer> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    String s = sc.next();

    if(s.equals("SSS")){
        System.out.println(0);
    }else if(s.equals("SRS") || s.equals("SSR") || s.equals("RSS") || s.equals("RSR")){
        System.out.println(1);
    }else if(s.equals("SRR") || s.equals("RRS")){
        System.out.println(2);
    }else{
        System.out.println(3);
    }


    

   
    





}
}