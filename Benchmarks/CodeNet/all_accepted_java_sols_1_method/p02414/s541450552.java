import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] f=br.readLine().split(" ");
        int n=Integer.parseInt(f[0]);
        int m=Integer.parseInt(f[1]);
        int l=Integer.parseInt(f[2]);
        int[] A=new int[n*m];
        int[] B=new int[m*l];
        int h=0;
        for(int i=0;i<n;i++){
        	String[] s=br.readLine().split(" ");
        	for(int j=0;j<m;j++){
        		A[h]=Integer.parseInt(s[j]);
        		h++;
        	}
        }
        for(int j=0;j<m;j++){
        	int bc=j;
        	String[] t=br.readLine().split(" ");
        	for(int k=0;k<l;k++){
        		B[bc]=Integer.parseInt(t[k]);
        		bc+=m;
        	}
        }
    	int ac=0,bc=0,al=0,c=0;
    	long v=0;
    	StringBuilder sb=new StringBuilder();
        while(c<n){
        	v+=A[ac]*B[bc];
        	if(ac<(c*m+(m-1))){
        		ac++;
        	}else{
        		sb.append(v);
        		v=0;
        		if(al<l-1){
        			sb.append(" ");
        			ac-=m-1;
        			al++;
        		}else{
        			sb.append("\n");
        			ac++;
        			al=0;
        			c++;
        		}
        	}
        	if(bc<m*l-1){
        		bc++;
        	}else{
        		bc=0;
        	}
        }
        System.out.print(sb);
	}
}