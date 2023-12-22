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
    String t = sc.next();

    for(int i = 0; i < n ; i++){
        list1.add(s.charAt(i));
        list1.add(t.charAt(i));
    }

    List<String> change = list1.stream().map(e -> String.valueOf(e)).collect(Collectors.toList());
    //System.out.println(list1);
    //System.out.println(String.join("",change));
    System.out.println(String.join("", change));


        
    
	}
}