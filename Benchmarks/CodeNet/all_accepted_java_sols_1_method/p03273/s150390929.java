import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int H = sc.nextInt();
	int W = sc.nextInt();
	String s = "";
	for(int i=0;i<H;i++){
	    s += sc.next();
	}
	s.trim();
	char[][] hw = new char[H][W];
	boolean[] ww = new boolean[W];
	boolean[] hh = new boolean[H];
	for(int i=0;i<H;i++){
	    for(int j=0;j<W;j++){
		hw[i][j] = s.charAt(i*W + j);
		if(hw[i][j] == '#'){
		    ww[j]=true;
		    hh[i]=true;
		}
	    }
	}
	for(int i=0;i<H;i++){
	    boolean isp = false;
	    for(int j=0;j<W;j++){
		if(hh[i]==true && ww[j]==true){
		    System.out.print(hw[i][j]);
		    isp = true;
		}
	    }
	    if(isp){
		if(i!=H-1) System.out.println();
	    }
	}
    }
}
