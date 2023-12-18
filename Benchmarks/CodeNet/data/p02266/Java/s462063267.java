import java.io.*;
import java.util.*;

public class Main {

    static int index=0;
    static char[] c;
    static int s=0;
    static int n;
    static int[][] a=new int[40001][2001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        n=str.length();
        c=new char[str.length()];
        Stack<Integer> stack =new Stack<>();
        Stack<int[]> sub_stack=new Stack<>();
        int sum=0;
        int temp_sum=0;
        int d=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='\\'){ d--; stack.push(i); }
            if(str.charAt(i)=='/' && !stack.isEmpty()){
                d++;
                int temp=stack.pop();
                sum+=(i-temp);
                temp_sum=(i-temp);
                while(!sub_stack.isEmpty() && sub_stack.peek()[0]>temp){ temp_sum+=(sub_stack.pop()[1]); }
                sub_stack.push(new int[]{temp,temp_sum});
            }
        }
        Stack<Integer> sum_stack=new Stack<>();
        while(!sub_stack.isEmpty()){ sum_stack.push(sub_stack.pop()[1]); }
        System.out.println(sum);
        System.out.print(sum_stack.size());
        while(!sum_stack.isEmpty()){ System.out.print(" "+sum_stack.pop()); }
        System.out.println();
    }
    
}