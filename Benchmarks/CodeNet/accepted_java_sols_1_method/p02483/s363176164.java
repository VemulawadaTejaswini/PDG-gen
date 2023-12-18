import java.io.*;
 
 class Main {
       public static void main (String[ ] args) throws IOException {
                          
                 BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
                 String str = input.readLine( );
                                                               
		 String[] ary = str.split(" ");
                 Integer[] tmp = new Integer[3];
		 Integer tmpp;
		 for(int i=0;i<ary.length; i++){
		     tmp[i] = new Integer(ary[i]);
		 }
		 for(int i=0;i<tmp.length-1;i++){
		     for(int j=i+1;j<tmp.length;j++){
			 if(tmp[i]>tmp[j]){
			     tmpp = tmp[i];
			     tmp[i] = tmp[j];
			     tmp[j] = tmpp;
			 }
		     }
		 }
		 System.out.println(tmp[0]+" "+tmp[1]+" "+tmp[2]);
		     
       }
 }