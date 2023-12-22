import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    		String kosu=br.readLine();
    		int nako=Integer.parseInt(kosu);
        	String strArr[] = br.readLine().split(" ");
        	int[] a=new int[nako];

        	for(int j=0; j<nako; j++){
        		a[j]=Integer.parseInt(strArr[j]);
        	}

        	for(int i=0;i<nako-1;i++){
        	      for(int j=nako-1;j>i;j--){

        		if(a[j]<a[j-1]){
        		  int t=a[j];
        		  a[j]=a[j-1];
        		  a[j-1]=t;
        		}
        	  }
        	}

        	long sum=0;
        	for(int i=0; i<nako; i++){
        		sum+=a[i];
        	}

        	System.out.println(a[0]+" "+a[nako-1]+" "+sum);

    }
}