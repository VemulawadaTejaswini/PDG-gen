import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		String[] a;
        int r=0,t=0,h=0;
        for(int i=0;i<n;i++){
            a=br.readLine().split(" ");
            r=a[0].compareTo(a[1]);
            if(r>0){ t+=3;
            }else if(r<0){ h+=3;
            }else{ t++; h++; }
        }
		System.out.println(t+" "+h);
	}
}