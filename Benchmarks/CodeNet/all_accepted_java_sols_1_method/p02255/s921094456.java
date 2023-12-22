import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        String line2 = br.readLine();
        String[] str = line2.split(" ");
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i]=Integer.parseInt(str[i]);
        for(int i=0;i<n;i++){
        	int tmp = a[i];
        	int j = i-1;
        	while(j>=0&&a[j]>tmp){
        		a[j+1]=a[j];
        		j--;
        	}
        	a[j+1]=tmp;
        	for(int k=0;k<n;k++){
        		if(k!=n-1)System.out.print(a[k]+" ");
        		else System.out.println(a[k]);
        	}
        }
	}
}