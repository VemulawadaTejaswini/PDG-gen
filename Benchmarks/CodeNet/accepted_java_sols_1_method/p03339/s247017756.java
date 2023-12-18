import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[] s = sc.next().toCharArray();
        int[] east = new int[s.length+1];
        int[] west = new int[s.length+1];
        east[0] = 0;
        west[0] = 0;
        for(int i = 1;i<s.length+1;i++){
            east[i] = east[i-1];
            west[i] = west[i-1];
            if(s[i-1] == 'W'){
                east[i] += 1;
            }
            if(s[i-1] == 'E'){
                west[i] += 1;
            }
        }
        // for(int data:west){
        //     System.out.print(data + " ");
        // }
        // System.out.println("");
        // System.out.println("e");
        // for(int data:east){
        //     System.out.print(data + " ");
        // }
        // System.out.println("");
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<s.length+1;i++){
            int count = 0;
            count += east[i-1];
            count += west[s.length] - west[i];
            min = Math.min(min,count);
        }
        System.out.println(min);
    }
}