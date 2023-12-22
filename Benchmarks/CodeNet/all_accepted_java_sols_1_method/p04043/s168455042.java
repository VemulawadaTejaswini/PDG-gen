import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ArrayList<Integer> list;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a == 5 && b == 7 && c == 5){
            System.out.println("YES");
        }else if(a == 7 && b == 5 && c == 5){
            System.out.println("YES");
        }else if(a == 5 && b == 5 && c == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}
}