import java.io.*;
import java.util.*;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


class Main {
	public static void main(String[] a) throws IOException {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		for(int i = 0; i < 26 ; i++){
			char c[] = str.toCharArray();
			String output = "";
			for(int k = 0;k < c.length ;k++){
				if(c[k]>='a'&&c[k]<='z'){
					if(c[k] == 'z'){
						c[k] = 'a';
					}else{
						c[k]++;
					}
				}
			}
			String ans=String.valueOf(c);
			System.out.println(ans);
			 if(output.contains("this") || output.contains("the") || output.contains("that")){
                 System.out.println(output);
                 break;
             }
		}
	}
}