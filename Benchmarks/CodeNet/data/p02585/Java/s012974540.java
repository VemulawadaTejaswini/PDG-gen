import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static void solve(){//Here is the main function
      ArrayList<Integer> one = nextIntArray();
      int N = one.get(0);
      int K = one.get(1);
      long[] sum = new long[N];//1週分の合計値
      int[] amari = new int[N];//Kをloopで割った余り
      int[] loop = new int[N];//何回周回できる？
      long output = -1 * (1 << 63);
      ArrayList<Integer> plist = nextIntArray();
      ArrayList<Integer> clist = nextIntArray();
      for(int i = 0; i < N; i++){
        int now = plist.get(i) - 1;
        long s = clist.get(now);
        int dist = 1;
        while(i != now){
          now = plist.get(now) - 1;
          s += clist.get(now);
          dist++;
        }
        sum[i] = s;
        loop[i] = K / dist;
        amari[i] = K % dist;
      }
      for(int i = 0; i < N; i++){
        String ch = sum[i] + " " + loop[i] + " " + amari[i];
        myerr(ch);
      }
      for(int i = 0; i < N; i++){
        long s = 0;
        if(sum[i] >= 0){
          s = sum[i] * loop[i];
        }
        int now = plist.get(i) - 1;
        s += clist.get(now);
        output = Math.max(s, output);
        int dist = 1;
        while(i != now && dist < amari[i]){
          now = plist.get(now) - 1;
          s += clist.get(now);
          output = Math.max(s, output);
          dist++;
        }
        
      }
      myout(output);
	}
	//Method addition frame start



	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<>(1024);
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
	static HashMap<Integer, String> CONVSTR = new HashMap<>();
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
		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Integer.parseInt(input.get(i)));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<>(input.size());
		for(int i = 0; i < input.size(); i++){
			ret.add(Long.parseLong(input.get(i)));
		}
		return ret;
	}
	@SuppressWarnings("unchecked")
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
