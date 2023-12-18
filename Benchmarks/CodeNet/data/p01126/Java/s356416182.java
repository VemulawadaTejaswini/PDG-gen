import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class Main {
    public static void main(String[] args) throws IOException {
	ByteBuffer buf = ByteBuffer.allocate(1000000);
	{
	    buf.clear();
	    Channels.newChannel(System.in).read(buf);
	    buf.flip();
	}
	int n, m, a;
	while ((n = get(buf)) != 0) {
	    m = get(buf);
	    a = get(buf);
	    int max = 0;
	    int[][] amida = new int[1000][n + 1];
	    for (int i = 0; i < m; i++) {
		int h = get(buf) - 1;
		int p = get(buf);
		int q = get(buf);
		amida[h][p] = q;
		amida[h][q] = p;
		max = Math.max(h, max);
	    }
	    for (int h = max; h >= 0; h--) {
		if (amida[h][a] != 0) {
		    a = amida[h][a];
		}
	    }
	    System.out.println(a);
	}
    }

    private static int get(ByteBuffer buf) {
	int i = buf.get();
	while (i < '0' || '9' < i) {
	    i = buf.get();
	}
	int res = 0;
	while ('0' <= i && i <= '9') {
	    res = res * 10 + (i - '0');
	    i = buf.get();
	}
	return res;
    }

}