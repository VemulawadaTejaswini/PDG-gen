import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while(sc.hasNext()){
        	int m = sc.nextInt();
        	int f = sc.nextInt();
        	int r = sc.nextInt();
        	if(m==-1 && f==-1 && r==-1) break;
        	if((m > 50) || (f > 50)) break;

        	if((m == -1) || (f == -1)){
        		out.println("F");
        	}else if(m+f >= 80){
        		out.println("A");
        	}else if((m+f>=65)&&(m+f<80)){
        		out.println("B");
        	}else if((m+f>=50) && (m+f<65)){
        		out.println("C");
        	}else if((m+f>=30) && (m+f<50)){
        		if(r >= 50){
        			out.println("C");
        		}else{
        			out.println("D");
        		}
        	}else if(m+f<30){
        		out.println("F");
        	}
        	out.close();
        }
    }
}