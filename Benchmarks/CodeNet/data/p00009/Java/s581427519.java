import java.io.*;
import java.util.HashMap;

public class Main
{
    static HashMap<Integer, Boolean> prime;

    static boolean isprime(int n)
    {
	if (n==2) {
	    return true;
	} else if (n % 2==0) {
	    return false;
	} else if (prime.containsKey(n)) {
	    return prime.get(n);
	} else {
	    for (int i=3; i<=Math.sqrt(n); i+=2){
		if (n % i == 0) {
		    prime.put(n,false);
		    return false;
		}
	    }
	    prime.put(n, true);
	    return true;
	}
    }

    static int nprime(int n)
    {
	if (n==2) {
	    return 1;
	}
	int num=1;
	for (int i=3; i<=n; i+=2){
	    if (isprime(i)){
		num += 1;
	    }
	}
	return num;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
	prime = new HashMap<Integer, Boolean>();
        while ((line = br.readLine()) != null && !line.isEmpty()) {
	    int n = Integer.parseInt(line);
	    System.out.println(nprime(n));
	}
    }
}