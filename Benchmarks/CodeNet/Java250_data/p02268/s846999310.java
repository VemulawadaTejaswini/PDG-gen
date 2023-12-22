import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n=Integer.parseInt(br.readLine());
        String[] str=br.readLine().split(" ");
        int[] S=new int[n];
        
        for(int i=0;i<n;i++)
            S[i]=Integer.parseInt(str[i]);
         
        int q=Integer.parseInt(br.readLine());
        str=br.readLine().split(" ");
        boolean con;
        int count=0;
        for(int i=0;i<q;i++)
            {con=false;
        	con=method(S,Integer.parseInt(str[i]));
            if(con)count++;}
        System.out.println(count);
         
        
         
 
    }
    static boolean method(int[] s,int t){
                        
        int count=0;
        int q=s.length/4;
        
        	if(t>s[q*2]){
        		if(t>s[q*3]){
            		for(int j=s[q*3];j<s.length;j++)
            			if(t==s[j]){count++;break;}}
            	else if(t<s[q*3]){
            		for(int j=q*2;j<q*3;j++)if(t==s[j]){count++;break;}}
            	else if(s[q*3]==t){count++;}}
        	
        	else if(t<s[q*2]){
        		if(t>s[q]){
            		for(int j=s[q+1];j<q*2;j++)
            			if(t==s[j]){count++;break;}}
            	else if(t<s[q]){
            		for(int j=0;j<q;j++)if(t==s[j]){count++;break;}}
            	else if(s[q]==t){count++;}}
        	
        		
        	else if(s[s.length/2]==t){count++;}
        		
        	
        
        
                 
        return count==1;
    }
 
}