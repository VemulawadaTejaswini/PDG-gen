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
        int[] T=new int[q];
        for(int i=0;i<q;i++)
            T[i]=Integer.parseInt(str[i]);
         
        System.out.println(method(S,T));
         
 
    }
    static int method(int[] s,int[] t){
        if(s.length<t.length){
            int[] tmp=s;
            s=t;
            t=tmp;
        }
        
        int count=0;
        int q=s.length/4;
        for(int i=0;i<t.length;i++){
        	if(t[i]>s[q*2]){
        		if(t[i]>s[q*3]){
            		for(int j=s[q*3];j<s.length;j++)
            			if(t[i]==s[j]){count++;break;}}
            	else if(t[i]<s[q*3]){
            		for(int j=q*2;j<q*3;j++)if(t[i]==s[j]){count++;break;}}
            	else if(s[q*3]==t[i]){count++;continue;}}
        	
        	else if(t[i]<s[q*2]){
        		if(t[i]>s[q]){
            		for(int j=s[q+1];j<q*2;j++)
            			if(t[i]==s[j]){count++;break;}}
            	else if(t[i]<s[q]){
            		for(int j=0;j<q;j++)if(t[i]==s[j]){count++;break;}}
            	else if(s[q]==t[i]){count++;continue;}}
        	
        		
        	else if(s[s.length/2]==t[i]){count++;continue;}
        		
        	
        }
        
                 
        return count;
    }
 
}