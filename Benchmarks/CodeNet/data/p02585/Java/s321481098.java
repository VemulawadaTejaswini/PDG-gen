import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
		String s;
		String sl[];

		s = r.readLine();
		sl = s.split(" ");

		int n = Integer.parseInt(sl[0]);
		int k = Integer.parseInt(sl[1]);

		s = r.readLine();
		sl = s.split(" ");
		int p[] = new int[n];
		long c[] = new long[n];
		for(int i = 0; i < n; i++)
		{
			p[i] = Integer.parseInt(sl[i]) - 1;
		}
		s = r.readLine();
		sl = s.split(" ");
		for(int i = 0; i < n; i++)
		{
			c[i] = Long.parseLong(sl[i]);
		}



		int rep[] = new int[n];
		Arrays.fill(rep, -1);
		long fst[] = new long[n];
		// rep
		int clen[] = new int[n];
		long cval[] = new long[n];
		long max[] = new long[n];
		for(int rep_node = 0; rep_node < n; rep_node++)
		{
			if(rep[rep_node] >= 0) continue;
			long val = 0;
			int len = 0;
			int node = rep_node;
			do
			{
				node = p[node];
				val += c[node];
				rep[node] = rep_node;
				fst[node] = val;
				len++;
			}while(node != rep_node);

			clen[rep_node] = len;
			cval[rep_node] = val;
			rep[rep_node] = rep_node;
			fst[rep_node] = 0;
		}

		long ans = Long.MIN_VALUE;
		for(int node = 0; node < n; node++)
		{
			if(clen[rep[node]] == 1)
			{
				max[node] = (cval[rep[node]] > 0 ? k : 1) * cval[rep[node]];
				ans = Math.max(ans, max[node]);
				continue;
			}
			//System.out.println(node);
			long tmax = 0;
			long val = 0;
			int maxi = 0;
			int tnode = node;
			int kk = Math.min(k, clen[rep[node]] - 1);
			if(k <= clen[rep[node]] - 1 || cval[rep[node]] <= 0) tmax = Long.MIN_VALUE / 2;
			for(int i = 0; i < kk; i++)
			{
				tnode = p[tnode];
				val += c[tnode];
				//System.out.println(val);
				if(tmax < val)
				{
					tmax = val;
					maxi = i + 1;
				}
			}
			max[node] = tmax + (cval[rep[node]] > 0 ? (k - maxi) / clen[rep[node]] * cval[rep[node]] : 0);
			ans = Math.max(ans, max[node]);
		}

//		System.out.println(Arrays.toString(p));
//		System.out.println(Arrays.toString(c));
//		System.out.println(Arrays.toString(rep));
//		System.out.println(Arrays.toString(fst));
//		System.out.println(Arrays.toString(clen));
//		System.out.println(Arrays.toString(cval));
//		System.out.println(Arrays.toString(max));
		System.out.println(ans);
	}
}