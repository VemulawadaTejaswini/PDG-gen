import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = {10000000,1000000,100000,10000,1000,100,10,1};
        while(scan.hasNext()){
            int n = scan.nextInt();
        	for(int k = 0;k < n;k++){
        		char[] ch = scan.next().toCharArray();
        		Arrays.sort(ch);
        		int b = 0;
        		for(int i = 0,j = 7;i < 8;i++,j--){
        			b += (Integer.parseInt(ch[j]+"") - Integer.parseInt(ch[i]+""))*a[i];
        		}
        		System.out.println(b);
        	}
        }
    }
}