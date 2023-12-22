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

    int k = sc.nextInt();
    int x = sc.nextInt();
    int coin = 500 * k;
    if(coin >= x){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }


}