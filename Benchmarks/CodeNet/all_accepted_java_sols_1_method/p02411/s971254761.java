import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int m=Integer.parseInt(a[0]);
        int f=Integer.parseInt(a[1]);
        int r=Integer.parseInt(a[2]);
		int k=m+f;
        while(!(m==-1&&f==-1&&r==-1)){
    		String g=null;
        	if(m==-1||f==-1||k<30){
        		g="F";
        	}else if(30<=k&&k<50){
        		if(r>=50){
        			g="C";
        		}else{
        			g="D";
        		}
        	}else if(50<=k&&k<65){
        		g="C";
        	}else if(65<=k&&k<80){
        		g="B";
        	}else{
        		g="A";
        	}
            System.out.println(g);
        	a=br.readLine().split(" ");
            m=Integer.parseInt(a[0]);
            f=Integer.parseInt(a[1]);
            r=Integer.parseInt(a[2]);
            k=m+f;
        }
	}
}