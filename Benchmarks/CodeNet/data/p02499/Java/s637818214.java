import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] ans;
	int l, a=0;
	ans = new int[26];
	for(int i=0;i<26;i++) ans[i]=0;
	outer:while(sc.hasNextLine()){
	    String line = sc.nextLine();
	    l=line.length();
	    for(int i=0;i<l;i++){
		if(line.charAt(i) == '.') break outer;
		char c  = line.charAt(i);
		if('A' <= c && c <= 'Z'){
		    int b = c;
		    a = b+32;
		    ans[a-97]++;
		}else if('a' <= c && c <= 'z'){
		    a = c;
		    ans[a-97]++;
		}
	    }
	}
	for(char c='a';c<='z';c++){
	    int i = c;
	    System.out.printf("%c : %d\n",c,ans[i-97]);
	    
	}
    }
}