import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = reader.readLine().split(" ");
        int[] l = new int[3];
        int t = 0;
        for(String p:list){
        	l[t] = Integer.parseInt(p);
        	t++;
            }
        Arrays.sort(l);
        if(l[0]==5 && l[1]==5 && l[2]==7){
        System.out.println("YES");
        }
        else {
        System.out.println("NO");}}}
        