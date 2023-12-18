
import java.io.*;
import java.util.*;
 
public class Main{
	
 
	public void solve(){
		while(true){
			int H = nextInt();
			if(H == 0) break;
			int[][] board = new int[H][5];
			for(int i = 0; i < H; i++){
				for(int j = 0; j< 5; j++){
					board[i][j] = nextInt();
				}
			}
			boolean erased = true;
			int score = 0;
			while(erased){
				erased = false;
				for(int i = 0; i < H; i++){
					int c = 0;
					int len = 0;
					for(int j = 0; j < 5; j++){
						if(board[i][j] == c){
							len++;
						}else{
							if(len >= 3 && c != 0){
								for(int k = 0; k < len; k++){
									board[i][j - 1 - k] = -1;
									score += c;
								}
								erased = true;
								
							}
							c = board[i][j];
							len = 1;
							
						}
					}

					if(len >= 3&& c != 0){
						for(int k = 0; k < len; k++){
							board[i][4 - k] = -1;
							score += c;
						}
						erased = true;
					}
				}
				for(int j = 0; j < 5; j++){
					int c = H - 1;
					for(int i = H - 1; i >= 0; i--){
						if(board[i][j] != -1){
							int tmp = board[i][j];
							board[c][j] = tmp;
							c--;
						}
					}
					for(int i = c; i >= 0; i--){
						board[i][j] = 0;
					}
				}
			}
			out.println(score);
		}
	}
	
	private static PrintWriter out;
	public static void main(String[] args){
		out = new PrintWriter(System.out);
		new Main().solve();
		out.flush();
	}
	
	
	
	public static int nextInt(){
		int num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10 + (c - '0');
		}
		return minus ? -num : num;
	}
	
	public static long nextLong(){
		long num = 0;
		String str = next();
		boolean minus = false;
		int i = 0;
		if(str.charAt(0) == '-'){
			minus = true;
			i++;
		}
		int len = str.length();
		for(;i < len; i++){
			char c = str.charAt(i);
			if(!('0' <= c && c <= '9')) throw new RuntimeException();
			num = num * 10l + (c - '0');
		}
		return minus ? -num : num;
	}
	public static String next(){
		int c;
		while(!isAlNum(c = read())){}
		StringBuilder build = new StringBuilder();
		build.append((char)c);
		while(isAlNum(c = read())){
			build.append((char)c);
		}
		return build.toString();
	}
	
	
	private static byte[] inputBuffer = new byte[1024];
	private static int bufferLength = 0;
	private static int bufferIndex = 0;
	private static int read(){
		if(bufferLength < 0) throw new RuntimeException();
		if(bufferIndex >= bufferLength){
			try{
				bufferLength = System.in.read(inputBuffer);
				bufferIndex = 0;
			}catch(IOException e){
				throw new RuntimeException(e);
			}
			if(bufferLength <= 0) return (bufferLength = -1);
		}
		return inputBuffer[bufferIndex++];
	}
	
	private static boolean isAlNum(int c){
		return '!' <= c && c <= '~';
	}
}