import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
  public static void main(String[] args)throws IOException{
	 int w,h;//size of map
	 int x=0,y=0;//temp
   	 int c=0;
   	 int map[][]=new int[50][50];//map[???][?¨?]
   	 System.out.println("tett");
	  while(true){		  
		  c=0;
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 String str = br.readLine();
    	 
    	 String[] a=str.split(" ");
    	 w=Integer.parseInt(a[0]);
    	 h=Integer.parseInt(a[1]);
    	 if(w==0&&h==0){
    		 break;
    	 }
    	 
    	 //??????????????\????????????
    	 for(int i=0;i<h;i++){
    		 str=br.readLine();
    		 a=str.split(" ");
    		 for(int j=0;j<w;j++){
    			 map[i][j]=Integer.parseInt(a[j]);
    		 }
    	 }
    	 //??°??????
    	 for(int i=0;i<h;i++){
    		 for(int j=0;j<w;j++){
    			 if(map[i][j]==1){
    				 c++;
    				 System.out.println(i+","+j);
    				 count(map,i,j);
    			 }
    		 	
    		 	
    		 }
    	 }
    	 System.out.println(c);
     }      

  }
  static void count(int map[][],int x,int y){
	  if(x<0||y<0){
		  return;
	  }else if(map[x][y]==0){
		  return;
	  }
	  else if(map[x][y]==1){
		  map[x][y]=0;
		  count(map,x+1,y+1);
		  count(map,x+1,y);
		  count(map,x,y+1);
		  count(map,x-1,y-1);
		  count(map,x-1,y);
		  count(map,x,y-1);
		  count(map,x-1,y+1);
		  count(map,x+1,y-1);
	  }
	  
  }
}