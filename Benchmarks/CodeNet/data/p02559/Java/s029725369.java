import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
      ArrayList<Integer> one = nextIntArray();
      int N = one.get(0);
      int Q = one.get(1);
      ArrayList<Integer> list = nextIntArray();
      FenwickTree ft = new FenwickTree(N);
      for(int i = 0; i < N; i++){
        ft.add(i, list.get(i));
      }
      for(int i = 0; i < N; i++){
        //myout(ft.list[i]);
      }
      for(int i = 0; i < Q; i++){
        ArrayList<Integer> tmp = nextIntArray();
        int t = tmp.get(0);
        int ql = tmp.get(1);
        int qr = tmp.get(2);
        if(t == 0){
          ft.add(ql, qr);
        }else{
          myout(ft.rangeSum(ql, qr));
        }
      }
	}
	//Method addition frame start

static class FenwickTree{
  long[] list;
  int N;
  FenwickTree(int N){
    list = new long[N];
    this.N = N;
  }
  
  public void add(int i, long v){
    if(v == 0){
      return;
    }
    for(i++; i <= N; i += (i & -i)){
      list[i - 1] += v;
    }
  }
  
  public long sum(int i){
    long sum = 0;
    for(; i > 0; i -= (i & -i)){
      sum += list[i - 1];
    }
    return sum;
  }
  
  //0-indexed
  public long rangeSum(int L, int R){
    return sum(R) - sum(L);
  }
}

	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine()) != null){
					inputLine.add(read);
				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
			}else{
				throw new IndexOutOfBoundsException("There is no more input");
			}
		}
	}
	static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
	static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
	static PrintWriter out = new PrintWriter(System.out);
	static void flush(){out.flush();}
	static void myout(Object t){out.println(t);}
	static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
	static String next(){return ii.next();}
	static boolean hasNext(){return ii.hasNext();}
	static int nextInt(){return Integer.parseInt(next());}
	static long nextLong(){return Long.parseLong(next());}
	static double nextDouble(){return Double.parseDouble(next());}
	static ArrayList<String> nextStrArray(){return myconv(next(), 8);}
	static ArrayList<String> nextCharArray(){return myconv(next(), 0);}
	static ArrayList<Integer> nextIntArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}
