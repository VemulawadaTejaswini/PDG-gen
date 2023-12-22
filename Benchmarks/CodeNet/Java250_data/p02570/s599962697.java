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

    int d = sc.nextInt();
    int t = sc.nextInt();
    int s = sc.nextInt();

    if(d <= t*s){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }




}
}