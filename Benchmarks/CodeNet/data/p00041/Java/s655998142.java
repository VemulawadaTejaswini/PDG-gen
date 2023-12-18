import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<String> plist = new ArrayList<String>();
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	permutation("",0);
    	while(true){
    		int[] n = new int[4];
    		n[0] = input.nextInt();
    		n[1] = input.nextInt();
    		n[2] = input.nextInt();
    		n[3] = input.nextInt();
    		if(n[0] == 0 && n[1] == 0 && n[2] == 0 && n[3] == 0)break;
    		System.out.println(num(n));
    	}
    }
    
    public static String num(int[] n){
    	for(int i = 0 ; i < plist.size() ; i++){
			int[] p = new int[4];
			String pr = plist.get(i);
			p[0] = pr.charAt(0)-48;
			p[1] = pr.charAt(1)-48;
			p[2] = pr.charAt(2)-48;
			p[3] = pr.charAt(3)-48;
    		for(int j = 0 ; j < 3 ; j++){
    			for(int k = 0 ; k < 3 ; k++){
    				for(int l = 0 ; l < 3 ; l++){
    					
    					int a1 = calculate(n[p[0]],n[p[1]],j);
    					int a2 = calculate(a1,n[p[2]],k);
    					int a3 = calculate(a2,n[p[3]],l);
    					if(a3 == 10)return "((("+n[p[0]]+" "+calname(j)+" "+n[p[1]]+")"+" "+calname(k)+" "+n[p[2]]+") "+calname(l)+" "+n[p[3]]+")";
    					
    					a1 = calculate(n[p[0]],n[p[1]],j);
    					a2 = calculate(n[p[2]],n[p[3]],l);
    					a3 = calculate(a1,a2,k);
    					if(a3 == 10)return "(("+n[p[0]]+" "+calname(j)+" "+n[p[1]]+")"+" "+calname(k)+" ("+n[p[2]]+" "+calname(l)+" "+n[p[3]]+"))";
    					
    					a1 = calculate(n[p[1]],n[p[2]],k);
    					a2 = calculate(n[p[0]],a1,j);
    					a3 = calculate(a2,n[p[3]],l);
    					if(a3 == 10)return "(("+n[p[0]]+" "+calname(j)+" ("+n[p[1]]+""+" "+calname(k)+" "+n[p[2]]+")) "+calname(l)+" "+n[p[3]]+")";
    					
    					a1 = calculate(n[p[1]],n[p[2]],k);
    					a2 = calculate(a1,n[p[3]],l);
    					a3 = calculate(n[p[0]],a2,j);
    					if(a3 == 10)return "("+n[p[0]]+" "+calname(j)+" (("+n[p[1]]+""+" "+calname(k)+" "+n[p[2]]+") "+calname(l)+" "+n[p[3]]+"))";
    					
    					a1 = calculate(n[p[2]],n[p[3]],l);
    					a2 = calculate(n[p[1]],a1,k);
    					a3 = calculate(n[p[0]],a2,j);
    					if(a3 == 10)return "("+n[p[0]]+" "+calname(j)+" ("+n[p[1]]+""+" "+calname(k)+" ("+n[p[2]]+" "+calname(l)+" "+n[p[3]]+")))";
    				}
    			}
    		}
    	}
    	return "0";
    }
    
    public static void permutation(String s,int i){
    	if(s.length() == 4){
    		plist.add(s);
    	}else{
    		permutation(i+s,i+1);
    		StringBuilder sb = new StringBuilder(s);
    		for(int j = 1 ; j <= s.length(); j++){
    			permutation(sb.substring(0,j)+i+sb.substring(j,s.length()),i+1);
    		}
    	}
    }
    
    public static int calculate(int a,int b,int c){
    	if(c == 0){
    		return a+b;
    	}else if(c == 1){
    		return a-b;
    	}else if(c == 2){
    		return a*b;
    	}
    	return 0;
    }
    
    public static String calname(int c){
    	if(c == 0){
    		return "+";
    	}else if(c == 1){
    		return "-";
    	}else if(c == 2){
    		return "*";
    	}
    	return "0";
    }
}