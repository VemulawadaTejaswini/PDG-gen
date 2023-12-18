import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] a) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str ;
		
		int count = 0;
			while((str = br.readLine()) !=null) {
				
				int no = Integer.parseInt(str);
				for(int i=2;i<=no;i++) {
					if(isPrime(i))
						count++;
				}
			}
			System.out.println(count);
    }

    public static boolean isPrime(int no) {
		// TODO Auto-generated method stub
		boolean p = false;
		if (no == 2)
			p = true;
		else {
			for(int i=2;i<=(Math.sqrt(no));i++) {
				if(no%i==0)
					p = false;
				else 
					p = true;
			}
		}
		return p;
	}

}