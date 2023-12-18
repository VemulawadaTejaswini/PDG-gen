import java.util.*; import java.io.*; import java.math.*;
public class Main{
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
	static void solve(){//Here is the main function
		int N = nextInt();
		ArrayList<Long> list = nextLongArray();
		long check = list.get(0);
		for(int i = 0; i < N; i++){
			check = gcd(check, list.get(i));
		}
		if(check != 1){
			myout("not coprime");
    		return;
		}
		HashSet<Long> used = new HashSet<Long>();
		for(int i = 0; i < N; i++){
			HashMap<Long,Long> map = getPrimeFactorization(list.get(i));
			Iterator it = map.keySet().iterator();
			while(it.hasNext()){
				long key = (long)it.next();
				if(used.contains(key)){
					myout("setwise coprime");
        			return;
				}
				used.add(key);
			}
		}
		myout("pairwise coprime");
	}
	//Method addition frame start

static long gcd(long m, long n) {return n != 0 ? gcd(n, m % n) : m;}
static boolean isPrime(long val){
        if(val <= 1 || (val != 2 && val % 2 == 0)){
                return false;
        }else if(val == 2){
                return true;
        }
        double root = Math.floor(Math.sqrt(val));
        for(long i = 3; i <= root; i += 2){
                if(val % i == 0){
                        return false;
                }
        }
        return true;
}

static HashMap<Long,Long> getPrimeFactorization(Long val){
  HashMap<Long,Long> primeList = new HashMap<Long,Long>();
  if(isPrime(val)){
  	primeList.put(val, new Long("1"));
  	return primeList;
  }
  long div = 2;
  while(val != 1){
    if(val % div == 0){
      long count = 2;
      while(val % (long)Math.pow(div, count) == 0){
        count++;
      }
      if(primeList.get(div) == null){
        primeList.put(div, count - 1);
      }else{
        primeList.put(div, primeList.get(div) + (count - 1));
      }
      val /= (long)Math.pow(div, count - 1);
      if(isPrime(val)){
        if(primeList.get(val) == null){
          primeList.put(val,(long)1);
        }else{
          primeList.put(val,primeList.get(val) + 1);
        }
        break;
      }
    }else{
      div = (div == 2) ? div + 1 : div + 2;
    }
  }
  return primeList;
}

	//Method addition frame end
}
