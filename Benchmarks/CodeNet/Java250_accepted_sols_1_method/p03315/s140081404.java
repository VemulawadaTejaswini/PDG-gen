// Java implementation of Kosaraju's algorithm to print all SCCs
import java.io.*;
import java.util.*;
import java.util.LinkedList;

// This class represents a directed graph using adjacency list
// representation
public class Main
{ // Driver method
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        int ans=0;
        for (int i = 0; i <str.length(); i++) {
            if(str.charAt(i)=='+'){
                ans++;
            }else{
                ans--;
            }
        }
        System.out.println(ans);

    }
}