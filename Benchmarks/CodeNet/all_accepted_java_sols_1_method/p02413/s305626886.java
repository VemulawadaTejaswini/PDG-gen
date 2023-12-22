import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String b=" ",n="\n";
        String[] rc=br.readLine().split(b);
        int r=Integer.parseInt(rc[0]);
        int c=Integer.parseInt(rc[1]);
        int[] ct=new int[c];
        int t=0;
        for(int i=0;i<r;i++){
        	String str=br.readLine();
        	String[] row=str.split(b);
        	int rt=0;
        	for(int j=0;j<c;j++){
        		int v=Integer.parseInt(row[j]);
        		ct[j]+=v;
        		rt+=v;
        		if(i==r-1){
        			t+=ct[j];
        			sb2.append(ct[j]+b);
        		}
        	}
        	sb1.append(str+b+rt+n);
        }
        sb1.append(sb2).append(t);
        System.out.println(sb1);
	}
}