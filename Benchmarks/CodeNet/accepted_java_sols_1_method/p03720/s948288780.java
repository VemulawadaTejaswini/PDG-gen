import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); 
        int b = sc.nextInt();
        int c;
        int [] in = new int [a];
        for(int i=0;i<2*b;i++){c = sc.nextInt();
                              in[c-1]++;}       
        for(int i=0;i<a;i++){System.out.println(in[i]);}
	}
}
