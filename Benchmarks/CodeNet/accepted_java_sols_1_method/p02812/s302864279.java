import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    List<Character> list1 = new ArrayList<>();

    int n = sc.nextInt();
    String s = sc.next();
    int count = 0;

    for(int i = 0; i < n; i++){
        list1.add(s.charAt(i));
    }
    
    for(int i = 0; i < n-2; i++){
        if(list1.get(i).equals('A') && list1.get(i+1).equals('B') && list1.get(i+2).equals('C')){
            count++;
        }else{
        }
    }
    //System.out.println(list1.get(1));
    System.out.println(count);
    }
}