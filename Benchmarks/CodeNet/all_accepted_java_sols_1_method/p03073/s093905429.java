import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] arr=str.toCharArray();
        char[] arr1=new char[100000];
        if(arr[0]=='0') {
            for (int i = 0; i < str.length(); i+=2) {
                arr1[i]='0';
                arr1[i+1]='1';
            }
        }
        if(arr[0]=='1') {
            for (int i = 0; i < str.length(); i+=2) {
                arr1[i]='1';
                arr1[i+1]='0';
            }
        }
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(arr[i]!=arr1[i])
                count++;
        }
        System.out.println(count);

    }
}
