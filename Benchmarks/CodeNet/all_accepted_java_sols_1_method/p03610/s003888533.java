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
    StringBuilder result = new StringBuilder();
    //インデックスは0からスタートするので，奇数番目の文字は偶数のインデックスになる
    for(int i = 0; i < s.length(); i += 2){
        result.append(s.charAt(i));
    }
    System.out.println(result);

   
    





}
}