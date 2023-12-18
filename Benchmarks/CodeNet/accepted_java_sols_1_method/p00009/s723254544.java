import java.io.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s="";
		int[] map;
		int i,p,n,c;
		try {
			while(s!=null){
				s=r.readLine();
				n = Integer.parseInt(s);
				map = new int[n+1];
				c=0;
				for(i=2;i<=n/2;i++){
					map[i*2]=1;
				}
				p=3;
				while(p*p<=n){
					for(i=p;i<=n/p;i+=2){
						map[i*p]=1;
					}
					p++;
					while(map[p]==1){
						p++;
					}
				}
				for(i=2;i<=n;i++){
					if(map[i]==0){
						c++;
						//System.out.println(i);
					}
				}
				System.out.println(c);
			}
		} catch (Exception err) {
			System.exit(0);
		}
	}
}