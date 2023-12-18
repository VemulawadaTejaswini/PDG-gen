import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb1=new StringBuilder();
		StringBuilder sb2=new StringBuilder();
		String b=" ";
        String[] rc=br.readLine().split(b);
        int r=Integer.parseInt(rc[0]);
        int c=Integer.parseInt(rc[1]);
        int[] ct=new int[c];
        int t=0,rt=0,v=0;
        String str=null;
        String[] row=null;
        for(int i=0;i<r;i++){
        	str=br.readLine();
        	row=str.split(b);
        	rt=0;
        	for(int j=0;j<c;j++){
        		v=Integer.parseInt(row[j]);
        		ct[j]+=v;
        		rt+=v;
        		if(i==r-1){
        			t+=ct[j];
        			sb2.append(ct[j]+b);
        		}
        	}
        	sb1.append(str+b+rt+"\n");
        }
        sb1.append(sb2).append(t);
        System.out.println(sb1);
	}
}