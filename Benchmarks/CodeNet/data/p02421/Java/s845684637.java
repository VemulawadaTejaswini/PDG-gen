import java.io.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
        int t=0,h=0;
        for(int i=0;i<n;i++){
            String[] a=br.readLine().split(" ");
            int s=0;
            int l0=a[0].length();
            int l1=a[1].length();
            if(l0<l1){
            	s=l0;
            }else{
            	s=l1;
            }
            boolean even=false;
    		for(int j=0;j<s;j++){
    			if((int)a[0].charAt(j)>(int)a[1].charAt(j)){
    				t+=3;
    				even=false;
    				break;
    			}else if((int)a[0].charAt(j)<(int)a[1].charAt(j)){
    				h+=3;
    				even=false;
    				break;
    			}else{
    				even=true;
    			}
    		}
    		if(even){
                if(l0>l1){
                	t+=3;
                }else if(l0<l1){
                	h+=3;
                }else{
        			t+=1;
        			h+=1;
                }
    		}
        }
		System.out.println(t+" "+h);
	}
}