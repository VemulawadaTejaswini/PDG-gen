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
    //final List<Integer> list = new ArrayList<>();
    //final List<Integer> list2 = new ArrayList<>();
    //final List<Long> list3 = new ArrayList<>();

    String s = sc.next();
    int count = 0;
    
    for(int i = 0; i < s.length() ; i++){
        if(s.charAt(i) == 'o'){
            count++;
        }
    }

    System.out.println(700 + count*100);
    

    




    







}
}