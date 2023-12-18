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
    //final List<Long> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();

    int a = n / x ;
    if(n % x == 0){
        System.out.println(n / x * t);
    }else{
        System.out.println((n / x + 1) * t);
    }

    





}
}