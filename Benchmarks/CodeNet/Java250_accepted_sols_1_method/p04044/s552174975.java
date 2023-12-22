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
        int n = sc.nextInt();
        int l = sc.nextInt();
        List<String> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(sc.next());
        }
        Collections.sort(list);
        //System.out.println(list);
        System.out.println(String.join("", list));

	}
}