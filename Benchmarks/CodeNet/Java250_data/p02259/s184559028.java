import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        int[] a = new int[n];
        String line2 = br.readLine();
        String[] str = line2.split(" ");
        for(int i=0;i<n;i++)a[i]=Integer.parseInt(str[i]);
        boolean flag=true;
        int cnt=0;
        while(flag){
        	flag=false;
        	for(int j=n-1;j>0;j--){
        		if(a[j]<a[j-1]){
        			int tmp = a[j];
        			a[j] = a[j-1];
        			a[j-1]=tmp;
        			flag=true;
        			cnt++;
        		}
        	}
        }
    	for(int i=0;i<n;i++){
    		if(i!=n-1)System.out.print(a[i]+" ");
    		else System.out.println(a[i]);
    	}
    	System.out.println(cnt);
	}
}