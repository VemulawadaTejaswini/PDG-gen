import java.io.IOException;
import java.io.InputStream;
import java.util.InputMismatchException;

public class Main {
	static InputStream is = System.in;

	public static void main(String[] args) throws Exception
	{
		int n = ni();
		int M = 1000001;
		int W = (M>>>6)+1;
		long[] f1 = new long[W];
		long[] f2 = new long[W];
		long[] ex = new long[W];
		for(int i = 0;i < n;i++){
			int v = ni();
//			if(f1[v>>>6]<<~v>=0){
//				f1[v>>>6] |= 1L<<v;
//				if(ex[v>>>6]<<~v>=0){
//					for(int j = v*2;j < M;j+=v){
//						ex[j>>>6] |= 1L<<j;
//					}
//				}
//			}else{
//				f2[v>>>6] |= 1L<<v;
//			}
		}
//		int ans = 0;
//		for(int i = 0;i < W;i++){
//			ans += Long.bitCount((f1[i]^f2[i])&~ex[i]);
//		}
//		System.out.println(ans);
	}
	
	private static byte[] inbuf = new byte[1024];
	static int lenbuf = 0, ptrbuf = 0;
	
	private static int readByte()
	{
		if(lenbuf == -1)throw new InputMismatchException();
		if(ptrbuf >= lenbuf){
			ptrbuf = 0;
			try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
			if(lenbuf <= 0)return -1;
		}
		return inbuf[ptrbuf++];
	}
	
	private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
//	private static boolean isSpaceChar(int c) { return !(c >= 32 && c <= 126); }
	
	private static int ni()
	{
		int num = 0, b;
//		boolean minus = false;
//		while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
//		if(b == '-'){
//			minus = true;
//			b = readByte();
//		}
		while((b = readByte()) != -1 && !((b >= '0' && b <= '9')));
		
		while(true){
			if(b >= '0' && b <= '9'){
				num = num * 10 + (b - '0');
			}else{
				return num;
//				return minus ? -num : num;
			}
			b = readByte();
		}
	}
	
//	private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
}
