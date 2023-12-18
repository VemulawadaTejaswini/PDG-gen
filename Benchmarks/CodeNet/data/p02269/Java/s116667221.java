import java.util.Scanner;

class Dic{
	String word;
	public Dic(String str) {
		word=str;
	}
	public void Show() {
		System.out.println(word);
	}
}

public class Main{
   public static void main(String[] args){
       Scanner scan=new Scanner(System.in);
       int i,j,n,q,pagea=0,pagec=0,pageg=0,paget=0;
       n=scan.nextInt();
       String com;
       String str;
       Dic[] dica=new Dic[n];
       Dic[] dicc=new Dic[n];
       Dic[] dicg=new Dic[n];
       Dic[] dict=new Dic[n];
       for(i=0;i<n;i++) {
    	   com=scan.next();
    	   str=scan.next();
    	   switch (com) {
    		   case "insert":
    			   switch (str.charAt(0)) {
    				   case 'A':
    					   dica[pagea]=new Dic(str);
    					   pagea++;
    					   break;
    				   case 'C':
    					   dicc[pagec]=new Dic(str);
    					   pagec++;
    					   break;
    				   case 'G':
    					   dicg[pageg]=new Dic(str);
    					   pageg++;
    					   break;
    				   case 'T':
    					   dict[paget]=new Dic(str);
    					   paget++;
    					   break;
    				   default:
    					   continue;
    			   }
    			   break;
    		   case "find":
    			   switch (str.charAt(0)) {
    				   case 'A':
    					   for(j=0;j<pagea;j++) {
    	    				   if(dica[j].word.equals(str)) {
    	    					   break;
    	    				   }
    	    			   }
    	    			   if(j<pagea) {
    	    				   System.out.println("yes");
    	    			   }
    	    			   else {
    	    				   System.out.println("no");
    	    			   }
    					   break;
    				   case 'C':
    					   for(j=0;j<pagec;j++) {
    	    				   if(dicc[j].word.equals(str)) {
    	    					   break;
    	    				   }
    	    			   }
    	    			   if(j<pagec) {
    	    				   System.out.println("yes");
    	    			   }
    	    			   else {
    	    				   System.out.println("no");
    	    			   }
    					   break;
    				   case 'G':
    					   for(j=0;j<pageg;j++) {
    	    				   if(dicg[j].word.equals(str)) {
    	    					   break;
    	    				   }
    	    			   }
    	    			   if(j<pageg) {
    	    				   System.out.println("yes");
    	    			   }
    	    			   else {
    	    				   System.out.println("no");
    	    			   }
    					   break;
    				   case 'T':
    					   for(j=0;j<paget;j++) {
    	    				   if(dict[j].word.equals(str)) {
    	    					   break;
    	    				   }
    	    			   }
    	    			   if(j<paget) {
    	    				   System.out.println("yes");
    	    			   }
    	    			   else {
    	    				   System.out.println("no");
    	    			   }
    					   break;
    				   default:
    					   continue;
    			   }
    			   break;
    		   default:
    			   continue;
    	   }
       }
   }
}
