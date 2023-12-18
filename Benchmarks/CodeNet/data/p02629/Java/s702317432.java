import java.util.Scanner;
        
        public class Main {
        	public static void main(String[] args) {
        		Scanner in = new Scanner(System.in);
        		int N = in.nextInt();
        		int i = 0;
        		String[] str = new String[10];
        		
        		while(N>=1) {
        			if(N%26==1) {
        				str[i]="a";
        			}else if(N%26==2) {
        				str[i]="b";
        			}else if(N%26==3) {
        				str[i]="c";
        			}else if(N%26==4) {
        				str[i]="d";
        			}else if(N%26==5) {
        				str[i]="e";
        			}else if(N%26==6) {
        				str[i]="f";
        			}else if(N%26==7) {
        				str[i]="g";
        			}else if(N%26==8) {
        				str[i]="h";
        			}else if(N%26==9) {
        				str[i]="i";
        			}else if(N%26==10) {
        				str[i]="j";
        			}else if(N%26==11) {
        				str[i]="k";
        			}else if(N%26==12) {
        				str[i]="l";
        			}else if(N%26==13) {
        				str[i]="m";
        			}else if(N%26==14) {
        				str[i]="n";
        			}else if(N%26==15) {
        				str[i]="o";
        			}else if(N%26==16) {
        				str[i]="p";
        			}else if(N%26==17) {
        				str[i]="q";
        			}else if(N%26==18) {
        				str[i]="r";
        			}else if(N%26==19) {
        				str[i]="s";
        			}else if(N%26==20) {
        				str[i]="t";
        			}else if(N%26==21) {
        				str[i]="u";
        			}else if(N%26==22) {
        				str[i]="v";
        			}else if(N%26==23) {
        				str[i]="w";
        			}else if(N%26==24) {
        				str[i]="x";
        			}else if(N%26==25) {
        				str[i]="y";
        			}else {
        				str[i]="z";
        			}
        			i++;
        			N=N/26;
        		}
        		
        		for(int j=0;j<i;j++)
        			System.out.print(str[i-j-1]);
        	}
        }