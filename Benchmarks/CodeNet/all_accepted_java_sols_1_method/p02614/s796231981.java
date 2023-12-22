import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int w=sc.nextInt();
		int k=sc.nextInt();
		int ans=0;

  		String[][] a=new String[h][w];
		for(int c=0;c<h;c++){
          String s=sc.next();
		a[c]=s.split("");
    		
    	}
    
 	for(int f=0;f<(1<<h);f++){
    	for(int g=0;g<(1<<w);g++){
        	int count=0;
          	for(int d=0;d<h;d++){
            if((1&f>>d)==1){
              for(int e=0;e<w;e++){
              if((1&g>>e)==1&&a[d][e].equals("#")){
              count++;
              }
              }
     }
            }
          if(count==k){
          ans++;
          }
        }
    }

    	System.out.println(ans);
    }
}
