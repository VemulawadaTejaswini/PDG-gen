import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
		int count=0;
  		String[][] s=new String[h+2][w+2];
        
		for(int c=1;c<h+1;c++){
    		String si=sc.next();
           for(int d=1;d<w+1;d++){
            s[c][d]=Character.toString(si.charAt(d-1));  
           }
    	}
  
  for(int a=0;a<w+2;a++){
         s[0][a]=".";
         s[h+1][a]=".";
        }
  	for(int a=0;a<h+2;a++){
         s[a][0]=".";
         s[a][w+1]=".";
        }
  	for(int d=1;d<h+1;d++){
        for(int e=1;e<w+1;e++){
         if(s[d][e].equals("#")&&s[d][e-1].equals(".")&&s[d][e+1].equals(".")&&s[d-1][e].equals(".")&&s[d+1][e].equals(".")){
         count++;
           break;
         }
        }
        }
    
 	if(count==0){
    		System.out.println("Yes");
    	}else{
     		System.out.println("No");
   	 }

    	
    }
}
