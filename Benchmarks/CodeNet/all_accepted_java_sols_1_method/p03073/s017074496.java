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

    char[] work = new char[s.length()];
    int count = 0;

    for(int i = 0; i < s.length(); i++){
            work[i] = s.charAt(i);
    }
    for(int i = 0; i < s.length() - 1; i++){
        if(work[i] == work[i+1]){
            if(work[i+1] == '1'){
                work[i+1] = '0';
            }else{
                work[i+1] = '1';
            }
            count++;
        }
    }
    System.out.println(count);




}
}