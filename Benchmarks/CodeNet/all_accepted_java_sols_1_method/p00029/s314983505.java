import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
    public static void main(String[]args)throws Exception{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     String []wd=br.readLine().split(" ");
     int m2=0,m1=0,a2=0,a1=0; 
     for(int i=0;i<wd.length;i++){
    	 int temp=0;
    	 for(int k=i+1;k<wd.length;k++) if(wd[i].equals(wd[k]))temp++;
    	 if(m1<temp){m1=temp; a1=i; }
    	 if(m2<wd[i].length()){m2=wd[i].length(); a2=i;}
    	 }
     System.out.println(wd[a1]+" "+wd[a2]);
    }
}