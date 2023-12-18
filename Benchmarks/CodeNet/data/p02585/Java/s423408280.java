import java.util.*;
import java.io.*;
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] p = new int[n];
		for(int i = 0; i < n; i++){
		    p[i] = sc.nextInt() - 1;
		}
		int[] c = new int[n];
		for(int i = 0; i < n; i++){
		    c[i] = sc.nextInt();
		}
		
		// 計算
		long result = Long.MIN_VALUE;
		boolean[] flg = new boolean[n];
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		ArrayList<Long> sum = new ArrayList<Long>();
		for(int i = 0; i < n; i++){
		    if(flg[i]) continue;
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    long temp = 0;
		    int index = p[i];
		    for(int j = 0; j < n; j++){
		        if(flg[index]) break;
		        flg[index] = true;
		        list.add(c[index]);
		        temp += c[index];
		        index = p[index];
		    }
		    lists.add(list);
		    sum.add(temp);
		    //System.out.println(list);
		    //System.out.println(sum);
		}
		
		for(int i = 0; i < lists.size(); i++){
		    ArrayList<Integer> list = lists.get(i);
		    long temp = Long.MIN_VALUE;
		    if(sum.get(i) < 0){
		        for(int j = 0; j < list.size(); j++){
		            long[] array = new long[min(list.size(), k)];
		            array[0] = list.get(j);
		            long tempA = array[0];
		            for(int K = 1; K < min(list.size(), k); K++){
		                array[K] = array[K-1] + list.get((j+K)%list.size());
		                tempA = max(tempA, array[K]);
		            }
		            temp = max(temp, tempA);
		        }
		    }else{
		        int cnt = k/list.size();
		        int tempk = list.size()%k;
		        for(int j = 0; j < list.size(); j++){
		            long[] array = new long[min(list.size(), tempk)];
		            array[0] = list.get(j);
		            long tempA = array[0];
		            for(int K = 1; K < min(list.size(), tempk); K++){
		                array[K] = array[K-1] + list.get((j+K)%list.size());
		                tempA = max(tempA, array[K]);
		            }
		            temp = max(temp, tempA+sum.get(i)*cnt);
		        }
		    }
		    result = max(result, temp);
		}
		
		// 出力
		System.out.println(result);
	}
	
	public static class Scanner {
		private BufferedReader br; private StringTokenizer tok;
		public Scanner(InputStream is) throws IOException { br = new BufferedReader(new InputStreamReader(is));}
		private void getLine() throws IOException { while(!hasNext()) tok = new StringTokenizer(br.readLine());}
		private boolean hasNext() { return tok != null && tok.hasMoreTokens();}
		public String next() throws IOException { getLine(); return tok.nextToken();}
		public int nextInt() throws IOException { return Integer.parseInt(next());}
		public long nextLong() throws IOException { return Long.parseLong(next());}
		public double nextDouble() throws IOException { return Double.parseDouble(next());}
	}
}
